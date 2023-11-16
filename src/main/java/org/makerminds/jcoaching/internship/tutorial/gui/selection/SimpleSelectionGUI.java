package org.makerminds.jcoaching.internship.tutorial.gui.selection;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class SimpleSelectionGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleSelectionGUI frame = new SimpleSelectionGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleSelectionGUI() {
		createSimpleFrame();
		JComboBox<Object> languagesComboBox = createLanguageComponent();
		ButtonGroup bg = createExperienceComponents();

		JCheckBox checkBoxToLearn = new JCheckBox("Student?");
		checkBoxToLearn.setBounds(60, 127, 591, 30);
		contentPane.add(checkBoxToLearn);
		createDoneButton(languagesComboBox, bg, checkBoxToLearn);
	}

	private void createSimpleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private ButtonGroup createExperienceComponents() {
		JLabel experienceLabel = new JLabel("Experience:");
		experienceLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		experienceLabel.setBounds(60, 95, 239, 30);
		contentPane.add(experienceLabel);
		
		JRadioButton radioButtonYes = new JRadioButton("Yes");
		radioButtonYes.setActionCommand("Yes!"); // Use ActionCommand so we can get the text for the results
		radioButtonYes.setSelected(true); // By default choice yes
		radioButtonYes.setBounds(373, 95, 125, 30);
		contentPane.add(radioButtonYes);
		
		JRadioButton radioButtonNo = new JRadioButton("No");
		radioButtonNo.setActionCommand("No!");
		radioButtonNo.setBounds(500, 95, 151, 30);
		contentPane.add(radioButtonNo);
		
		// Buttongroup can be used when you want to be allowed to choose only on JRadioButton
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioButtonYes);
		bg.add(radioButtonNo);
		return bg;
	}

	private JComboBox<Object> createLanguageComponent() {
		JLabel languageLabel = new JLabel("Programming Language:");
		languageLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		languageLabel.setBounds(60, 59, 239, 30);
		contentPane.add(languageLabel);
		
		// Simple Object Array for selection of JComboBox
		JComboBox<Object> languagesComboBox = new JComboBox<Object>(new Object[] { "Java", "Python", "C++"});
		languagesComboBox.setBounds(373, 59, 278, 30);
		contentPane.add(languagesComboBox);
		return languagesComboBox;
	}

	private void createDoneButton(JComboBox<Object> languagesComboBox, ButtonGroup bg, JCheckBox checkIsStudent) {
		JButton doneButton = new JButton("Done");
		doneButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Here are all the selections told
				String studentDiscount = checkIsStudent.isSelected()  ? "Student discount applied." : "No student discount applied.";
				JOptionPane.showMessageDialog(SimpleSelectionGUI.this, "You chose " + languagesComboBox.getSelectedItem().toString() +" Language. "
						+ "\nExperience: " + bg.getSelection().getActionCommand() 
						+ "\n" + studentDiscount);
			}
		});
		doneButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		doneButton.setBounds(127, 261, 450, 51);
		contentPane.add(doneButton);
	}
}

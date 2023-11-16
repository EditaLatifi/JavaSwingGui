package org.makerminds.jcoaching.internship.tutorial.gui.transitions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimplePanelTransitioner {

	private JFrame frame;
	private Panel1Provider panelFromAnotherClass = new Panel1Provider();
	private Panel2Provider panel2FromAnotherClass = new Panel2Provider();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimplePanelTransitioner window = new SimplePanelTransitioner();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimplePanelTransitioner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(200, 11, 437, 390);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		layeredPane.add(panel, "name_79441741082600");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Panel 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(111, 154, 160, 33);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_79444400620400");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Panel 2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(149, 175, 115, 46);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Button 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(layeredPane, panelFromAnotherClass);
			}
		});
		btnNewButton.setBounds(32, 112, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnButton = new JButton("Button 2");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(layeredPane, panel2FromAnotherClass);

			}
		});
		btnButton.setBounds(32, 171, 89, 23);
		frame.getContentPane().add(btnButton);
	}
	public void switchPanels(JLayeredPane layeredPane , JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
}

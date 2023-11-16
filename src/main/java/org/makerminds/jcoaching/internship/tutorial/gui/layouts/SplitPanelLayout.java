package org.makerminds.jcoaching.internship.tutorial.gui.layouts;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class SplitPanelLayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplitPanelLayout window = new SplitPanelLayout();
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
	public SplitPanelLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 984, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Task 1: create the navigation panel
		JPanel navigationBar = createNavigationBarPanel();
		
		
		// Task 2: create the content panel
		JPanel contentPanel = createContentPanel();

		// Task 3: create a component to manage two JPanels
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.add(contentPanel);
		
		// Task 4: add all components and show them in Swing GUI
		frame.getContentPane().add(navigationBar);
		frame.getContentPane().add(layeredPane);
	}

	private JPanel createContentPanel() {
		JPanel contentPanel = new JPanel();
		contentPanel.setBounds(266, 0, 704, 582);
		TitledBorder contentTitledBorder = BorderFactory.createTitledBorder("Content Panel");
		contentPanel.setBorder(contentTitledBorder);

		JLabel contentLabel = new JLabel("Content Space");
		contentPanel.add(contentLabel);
		return contentPanel;
	}

	private JPanel createNavigationBarPanel() {
		JPanel navigationBar = new JPanel();
		navigationBar.setBounds(0, 0, 266, 582);
		TitledBorder navigationBarTitledBorder = BorderFactory.createTitledBorder("Navigation Bar");
		navigationBarTitledBorder.setTitleJustification(TitledBorder.CENTER);
		navigationBar.setBorder(navigationBarTitledBorder);

		JLabel navigationBarLabel = new JLabel("Navigation Bar Buttons here ...");
		navigationBarLabel.setHorizontalAlignment(SwingConstants.CENTER);
		navigationBar.add(navigationBarLabel);

		return navigationBar;
	}
}

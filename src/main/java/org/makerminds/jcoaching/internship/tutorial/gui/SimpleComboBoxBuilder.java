package org.makerminds.jcoaching.internship.tutorial.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;

public class SimpleComboBoxBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleComboBoxBuilder window = new SimpleComboBoxBuilder();
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
	public SimpleComboBoxBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Create comboBox
		JComboBox comboBox = new JComboBox();
		//Set dimensions
		comboBox.setBounds(99, 114, 227, 22);
		//Add elements
		comboBox.addItem("MakerMinds");
		comboBox.addItem("Gonna Make");
		comboBox.addItem("Future");
		//Add comboBox to frame
		frame.getContentPane().add(comboBox);
	}
}

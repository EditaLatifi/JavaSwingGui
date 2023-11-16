package org.makerminds.jcoaching.internship.tutorial.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.Font;

public class SimplePasswordBuilder {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimplePasswordBuilder window = new SimplePasswordBuilder();
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
	public SimplePasswordBuilder() {
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
		
		//Create passwordField
		passwordField = new JPasswordField();
		//Set font
		passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
		//Set dimensions
		passwordField.setBounds(101, 82, 240, 49);
		//Set how letters will be presented to user in this case all words will be hiden inside *
		passwordField.setEchoChar('*');
		//Add to frame
		frame.getContentPane().add(passwordField);
	}
}

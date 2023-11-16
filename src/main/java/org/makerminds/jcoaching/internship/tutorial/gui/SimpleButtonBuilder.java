package org.makerminds.jcoaching.internship.tutorial.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;

public class SimpleButtonBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleButtonBuilder window = new SimpleButtonBuilder();
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
	public SimpleButtonBuilder() {
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
		
		//Create Button 
		JButton btnClick = new JButton("Click Me");
		//Set font
		btnClick.setFont(new Font("Arial", Font.PLAIN, 20));
		//Set Dimensions
		btnClick.setBounds(99, 102, 251, 61);
		//Add to frame
		frame.getContentPane().add(btnClick);
	}
}

package org.makerminds.jcoaching.internship.tutorial.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class SimpleLabelBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleLabelBuilder window = new SimpleLabelBuilder();
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
	public SimpleLabelBuilder() {
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
		
		//Creating label with text to display
		JLabel lblName = new JLabel("I am a label");
		//Set font
		lblName.setFont(new Font("Arial", Font.BOLD, 20));
		//Set position
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		//Set dimensions 
		lblName.setBounds(58, 70, 282, 80);
		//Add to frame
		frame.getContentPane().add(lblName);
	}

}

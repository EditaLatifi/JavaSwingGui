package org.makerminds.jcoaching.internship.tutorial.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class SimpleRadioButtonBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleRadioButtonBuilder window = new SimpleRadioButtonBuilder();
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
	public SimpleRadioButtonBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Create Radio Button
		JRadioButton rdbtnFirst = new JRadioButton("FirstRadioButton");
		//Set font
		rdbtnFirst.setFont(new Font("Arial", Font.PLAIN, 20));
		//Set position
		rdbtnFirst.setHorizontalAlignment(SwingConstants.CENTER);
		//Set dimension
		rdbtnFirst.setBounds(132, 69, 179, 23);
		//Add to frame
		frame.getContentPane().add(rdbtnFirst);
		
		//Create Radio Button
		JRadioButton rdbtnSecond = new JRadioButton("SecondRadioButton");
		//Set font
		rdbtnSecond.setFont(new Font("Arial", Font.PLAIN, 20));
		//Set position
		rdbtnSecond.setHorizontalAlignment(SwingConstants.CENTER);
		//Set dimension
		rdbtnSecond.setBounds(105, 130, 234, 23);
		//Add to frame
		frame.getContentPane().add(rdbtnSecond);
	}
}

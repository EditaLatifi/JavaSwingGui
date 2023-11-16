package org.makerminds.jcoaching.internship.tutorial.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class SimpleScrollPaneBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleScrollPaneBuilder window = new SimpleScrollPaneBuilder();
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
	public SimpleScrollPaneBuilder() {
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
		
		//Create scrollPane
		JScrollPane scrollPane = new JScrollPane();
		//Set dimensions
		scrollPane.setBounds(65, 52, 288, 156);
		//Add to frame 
		frame.getContentPane().add(scrollPane);
	}
}

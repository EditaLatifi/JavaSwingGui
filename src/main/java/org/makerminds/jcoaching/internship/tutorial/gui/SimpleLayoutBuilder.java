package org.makerminds.jcoaching.internship.tutorial.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class SimpleLayoutBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleLayoutBuilder window = new SimpleLayoutBuilder();
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
	public SimpleLayoutBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Initialize Frame
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Call The method who will create Panel with Absolute Layout
		createPanelWithAbsoluteLayout();
		//Call The method who will create Panel with Flow Layout
		createPanelWithFlowLayout();
		//Call The method who will create Panel with Border Layout
		createPanelWithBorderLayout();
		//Call The method who will create Panel with Grid Layout
		createPanelWithGridLayout();
	}
	private void createPanelWithGridLayout() {
		//Create JPanel
		JPanel paneGrid = new JPanel();
		//Add Border
		paneGrid.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//Set JPanel Dimensions ( x, y , width, height)
		paneGrid.setBounds(284, 152, 213, 111);
		//Add JPanel to JFrame 
		frame.getContentPane().add(paneGrid);
		//SetLayout
		paneGrid.setLayout(new GridLayout(1, 0, 0, 0));
		
		//Create JLabel
		JLabel lblNewLabel_3 = new JLabel("Right");
		//Set Horizontal Alignment :: TEXT TO STAY IN CENTER
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		//Add JLabel to JPanel
		paneGrid.add(lblNewLabel_3);
		
		//Create JLabel
		JLabel lblNewLabel_5 = new JLabel("Middle");
		//Set Horizontal Alignment :: TEXT TO STAY IN CENTER
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		//Add JLabel to JPanel
		paneGrid.add(lblNewLabel_5);
		
		//Create JLabel
		JLabel lblNewLabel_4 = new JLabel("Left");
		//Set Horizontal Alignment :: TEXT TO STAY IN CENTER
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		//Add JLabel to JPanel
		paneGrid.add(lblNewLabel_4);
		
		//Create JLabel
		JLabel lblNewLabel_6_1 = new JLabel("GridLayout");
		//Set Horizontal Alignment :: TEXT TO STAY IN CENTER
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		//Set Dimensions ( x,y,width,height)
		lblNewLabel_6_1.setBounds(368, 274, 85, 14);
		//Add JLabel to JPanel
		frame.getContentPane().add(lblNewLabel_6_1);
	}
	private void createPanelWithBorderLayout() {
		//Create Panel
		JPanel panelWithBorderLayout = new JPanel();
		//GiveBorder to JPanel
		panelWithBorderLayout.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//Set JPanel Dimensions ( x, y , width, height)
		panelWithBorderLayout.setBounds(54, 152, 202, 111);
		//Add JPanel to JFrame
		frame.getContentPane().add(panelWithBorderLayout);
		//Set Layout
		panelWithBorderLayout.setLayout(new BorderLayout(0, 0));
		
		//Create Label
		JLabel lblBorder = new JLabel("South");
		//Set Horizontal Alignment :: TEXT TO STAY IN CENTER
		lblBorder.setHorizontalAlignment(SwingConstants.CENTER);
		//Set Auto Scroll
		lblBorder.setAutoscrolls(true);
		//Add JLabel to JPanel
		panelWithBorderLayout.add(lblBorder, BorderLayout.SOUTH);
		
		//Create JLabel
		JLabel lblNewLabel = new JLabel("West");
		//Add JLabel to JPanel
		panelWithBorderLayout.add(lblNewLabel, BorderLayout.WEST);
		
		//Create JLabel
		JLabel lblNewLabel_1 = new JLabel("East");
		//Add JLabel to JPanel
		panelWithBorderLayout.add(lblNewLabel_1, BorderLayout.EAST);
		
		//Create JLabel
		JLabel lblNewLabel_2 = new JLabel("North");
		//Set Horizontal Alignment :: TEXT TO STAY IN CENTER
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		//Add JLabel to JPanel
		panelWithBorderLayout.add(lblNewLabel_2, BorderLayout.NORTH);
		
		//Create JLabel
		JLabel lblNewLabel_6 = new JLabel("Border Layout");
		//Set Horizontal Alignment :: TEXT TO STAY IN CENTER
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		//Set Dimensions ( x,y,width,height)
		lblNewLabel_6.setBounds(126, 274, 85, 14);
		//Add JLabel to JPanel
		frame.getContentPane().add(lblNewLabel_6);
	}
	private void createPanelWithFlowLayout() {
		//Create JPanel
		JPanel panelWithFlowLayout = new JPanel();
		//GiveBorder to JPanel
		panelWithFlowLayout.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//Set JPanel Dimensions ( x, y , width, height)
		panelWithFlowLayout.setBounds(284, 30, 213, 111);
		//Add JPanel to JFrame
		frame.getContentPane().add(panelWithFlowLayout);
		//Set layout
		panelWithFlowLayout.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//Create Label
		JLabel lblFlow = new JLabel("In Line");
		//Add Label to JPanel
		panelWithFlowLayout.add(lblFlow);
		
		//Create JLabel
		JLabel lblNewLabel_6_1_1 = new JLabel("FlowLayout");
		//Set Horizontal Alignment :: TEXT TO STAY IN CENTER
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		//Set Dimensions ( x,y,width,height)
		lblNewLabel_6_1_1.setBounds(344, 11, 85, 14);
		//Add JLabel to JPanel
		frame.getContentPane().add(lblNewLabel_6_1_1);
	}
	private void createPanelWithAbsoluteLayout() {
		//Create JPanel
		JPanel panelWithAbsoluteLayout = new JPanel();
		//GiveBorder to JPanel
		panelWithAbsoluteLayout.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//Set panel Dimensions ( x, y , width, height)
		panelWithAbsoluteLayout.setBounds(54, 30, 202, 111);
		//Add JPanel to frame
		frame.getContentPane().add(panelWithAbsoluteLayout);
		//Set layout in background is ABSOLUTE
		panelWithAbsoluteLayout.setLayout(null);
		
		//Create JLabel
		JLabel lblAbsolute = new JLabel("With absolute dimensions");
		//Set Alignment in horizontal way
		lblAbsolute.setHorizontalAlignment(SwingConstants.CENTER);
		//Set JLabel Dimensions ( x, y , width, height)
		lblAbsolute.setBounds(10, 22, 182, 31);
		//Ad JLabel to JPanel
		panelWithAbsoluteLayout.add(lblAbsolute);

		//Create JLabel
		JLabel lblNewLabel_6_1_2 = new JLabel("Absolute Layout");
		//Set Horizontal Alignment :: TEXT TO STAY IN CENTER
		lblNewLabel_6_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		//Set Dimensions ( x,y,width,height)
		lblNewLabel_6_1_2.setBounds(90, 5, 121, 14);
		//Add JLabel to JPanel
		frame.getContentPane().add(lblNewLabel_6_1_2);
	}
}

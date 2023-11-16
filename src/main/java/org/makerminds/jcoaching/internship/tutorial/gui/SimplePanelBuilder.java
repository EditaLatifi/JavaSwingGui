package org.makerminds.jcoaching.internship.tutorial.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

//When class extends JPanel automatically on design you can see the panel created
public class SimplePanelBuilder extends JPanel {

	/**
	 * Create the panel
	 */
	public SimplePanelBuilder() {
		//Set layout
		setLayout(null);
		
		JLabel lblPane = new JLabel("This is a panel");
		lblPane.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPane.setHorizontalAlignment(SwingConstants.CENTER);
		lblPane.setBounds(36, 115, 362, 73);
		//Add label to panel
		add(lblPane);

	}

}

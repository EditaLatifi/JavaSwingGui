package org.makerminds.jcoaching.internship.tutorial.gui.transitions;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Panel2Provider extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel2Provider() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Panel2FromAnotherClass");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(83, 85, 255, 96);
		add(lblNewLabel);

	}

}

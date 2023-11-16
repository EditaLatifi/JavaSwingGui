package org.makerminds.jcoaching.internship.tutorial.gui.transitions;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Panel1Provider extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel1Provider() {
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("PanelFromAnotherClass");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(53, 72, 330, 70);
		add(lblNewLabel);

	}
}

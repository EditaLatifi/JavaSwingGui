package org.makerminds.jcoaching.internship.tutorial.gui.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class LoginView extends JFrame {
	private JPanel contentPane;
	private JTextField nameField;
	private JPasswordField passwordField;
	private Font GENERAL_FONT = new Font("Tahoma", Font.BOLD, 14);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		createFrameComponents(); // Here you have JFrame Layout, Bound, Border
		createUserNameComponents(); // Here JLabel and JField for Username is created
		createPasswordComponents(); // Here JLabel and JPasswordField for Password is created
		createLoginButton(); // Here JButton and ClickEvent for Login is created
	}

	private void createFrameComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private void createLoginButton() {
		JButton loginButton = new JButton("Login");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Check if the typed user exists in our data and send a message
				JOptionPane.showMessageDialog(LoginView.this, 
						LoginController.loginUser(nameField.getText(), String.valueOf(passwordField.getPassword()))
						? "Login Successful" : "Login Failed!");
			}
		});
		loginButton.setFont(GENERAL_FONT);
		loginButton.setBounds(112, 177, 208, 44);
		contentPane.add(loginButton);
	}

	private void createPasswordComponents() {
		JLabel passwordLabel = createFieldLabel("Password:", 110);
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(167, 115, 149, 19);
		contentPane.add(passwordField);
	}

	private void createUserNameComponents() {
		JLabel nameLabel = createFieldLabel("Username:", 65);
		contentPane.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(167, 70, 149, 19);
		contentPane.add(nameField);
		nameField.setColumns(10);
	}
	
	private JLabel createFieldLabel(String fieldText, int yCoordinate)
	{
		JLabel simpleLabel = new JLabel(fieldText);
		simpleLabel.setFont(GENERAL_FONT);
		simpleLabel.setBounds(41, yCoordinate, 79, 24);
		return simpleLabel;
	}
}

package org.makerminds.jcoaching.internship.tutorial.gui.login.singleton;

public class User {
	
	private String userName;
	private String password;
	private String userRole; // create an Enum UserRole (ADMIN, WAITER, COOK)
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}

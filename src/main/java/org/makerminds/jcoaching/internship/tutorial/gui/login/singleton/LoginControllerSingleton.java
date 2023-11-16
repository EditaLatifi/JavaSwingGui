package org.makerminds.jcoaching.internship.tutorial.gui.login.singleton;

public class LoginControllerSingleton {
	
	// singleton variable
	private static LoginControllerSingleton loginController;
	
	private User loggedInUser = null;
	
	private LoginControllerSingleton() {
	}
	
	public void loginUser(String userName, String password) {
		loggedInUser = new User(userName, password);
	}
	
	public User getLoggedInUser() {
		return loggedInUser;
	}
	
	public static LoginControllerSingleton getInstance() {
		// implementation of the singleton pattern
		if(loginController == null) {
			loginController = new LoginControllerSingleton();
		}
		
		return loginController;
	}

}

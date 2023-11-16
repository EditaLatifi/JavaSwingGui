package org.makerminds.jcoaching.internship.tutorial.gui.login.singleton;

public class LoginViewSingleton {
	
	public void loginUser() {
		// get userName from textfield
		String userName = "TestUser";
		// get password from textfield
		String password = "123test";
		
		LoginControllerSingleton loginController = LoginControllerSingleton.getInstance();
		loginController.loginUser(userName, password);
		User loggedInUser = loginController.getLoggedInUser();
		
		System.out.println("Username: " + loggedInUser.getUserName());
		System.out.println("Password: " + loggedInUser.getPassword());
		
		RestaurantAdminView adminView = new RestaurantAdminView();
		adminView.getAllRestaurantsFromAdmin();
		
	}
	
	public static void main(String[] args) {
		LoginViewSingleton loginView = new LoginViewSingleton();
		loginView.loginUser();
	}

}

package org.makerminds.jcoaching.internship.tutorial.gui.login.singleton;

public class RestaurantAdminView {
	
	public void getAllRestaurantsFromAdmin() {
		
		// get all restaurants from the logged in user 
		LoginControllerSingleton loginController = LoginControllerSingleton.getInstance();
		User loggedInUser = loginController.getLoggedInUser();
		
		System.out.println("Username: " + loggedInUser.getUserName());
		System.out.println("Password: " + loggedInUser.getPassword());
	}

}

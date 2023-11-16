package org.makerminds.jcoaching.internship.tutorial.gui.login;

import java.util.HashMap;

public class LoginController {
	private static HashMap<String, String> users;
	
	public static boolean loginUser(String name, String password)
	{
		// Check if username exists in our data
		if(foundUser().containsKey(name))
		{
			// The User is found, now check if typed password is correct
			return password.equalsIgnoreCase(foundUser().get(password));
		}
		return false;
	}
	
	private static HashMap<String, String> foundUser()
	{
		if(users == null)
		{
			users = new HashMap<>();
			users.put("admin", "admin");
			users.put("user", "user");
			users.put("test", "test");
		}
		return users;
	}

	
}

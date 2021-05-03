package sign.controller;

import sign.view.Popup;
import java.util.*;

public class SignInController
{
	private Popup display;
	private Hashtable<String, String> userCred;
	private String username;
	private String password;
	
	public SignInController()
	{
		this.display = new Popup();
		this.userCred = new Hashtable<String,String>();
		this.username = new String();
		this.password = new String();
	}
	
	public void start()
	{
		setupCred();
		login("Maddie", "2002");

	}
	
	private void setupCred()
	{
		userCred.put("2002", "Maddie");
		
		userCred.put("5678", "Sally");
		
		userCred.put("9876", "Bill");
		
		userCred.put("5432", "Jackson");
		
		userCred.put("0220", "Sophie");
		
		userCred.put("0197", "Bryan");
		
		userCred.put("0106", "Melodie");
		
		userCred.put("0983", "Cody");
		
		userCred.put("0489", "Dallin");
		
		userCred.put("0707", "Kathrine");
		
		userCred.put("1098", "Harley");
	}

	public void signUp(String username, String password)
	{
		
	}
	
	public boolean login(String username, String password)
	{
		boolean isValid = false;
		
		username = username;
		
		
		for (int row = 0; row < userCred.length; row++)
		{
			for (int col = 0; col < userCred[0].length; col++)
			{
				if(username.equals(userCred[row]))
				{
					if (password.equals(userCred[row][col]))
					{
						isValid = true;
					
						return isValid;
					}
				}
			}
		}
				
		
		return isValid;
	}
	
	public void pages()
	{
		boolean results = false;
		  
		
	}
}


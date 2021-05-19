package sign.model;

import java.util.*;

import sign.view.Popup;

public class SignIn
{
	private Hashtable<String, String> userCred;
	private Popup display;

	
	public SignIn()
	{
		this.display = new Popup();
		this.userCred = new Hashtable<String,String>();

		
		setupCred();

		//pages();
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
	
	public boolean login(String username, String password)
	{
		boolean isValid = false;
		
		
		while (username.equalsIgnoreCase(userCred.get(password)))
		{
			if (username.equalsIgnoreCase(userCred.get(password)))
			{
				isValid = true;
				
				return isValid;
			}
		}
		
		return isValid;
	}
	
	public String pages(String username, String password)
	{
		
		boolean success = login(username, password);
		String respond = "Those are the wrong credentials.\nPlease try again later.\n";

		if (success == true)
		{
			if(username.equalsIgnoreCase("Maddie"))
			{
				return respond = "You have entered the director's page.\n";
			}
			else if (username.equalsIgnoreCase("Cody") || username.equalsIgnoreCase("Dallin") || username.equalsIgnoreCase("Scott"))
			{
				return respond = "Thank you for accessing the employee page.\n";
			}
			else
			{
				respond = "Thank you for you membership.\n";
				return respond;
			}
		}
		
		
		return respond;
	}
}

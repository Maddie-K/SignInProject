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
		pages();
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
	
	public void signIn(String username, String password)
	{
		if (!password.equalsIgnoreCase(userCred.get(password)))
		{
			userCred.put(password, username);
		}
		else
		{
			display.showMessage("That password is already in use.\nPlease choose another.");
		}
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
	
	public void pages()
	{
		String username = display.askQuestion("Username: ");
		String password = display.askQuestion("Password: ");
		
		boolean sucess = login(username, password);

		if (sucess == true)
		{
			if(username.equals("Maddie"))
			{
				admin();
			}
			else if (username.equals("Cody") || username.equals("Peter") || username.equals("Scott"))
			{
				employee();
			}
			else
			{
				display.showMessage("Thank you for you membership.");
			}
		}
		else
		{
			display.showMessage("Those are the wring credentials.\nPlease try again later.");

		}
		
	}
	
	private void admin()
	{
		String changes = "N";
		
		changes = display.askQuestion("You have entered the director's page.\nWould you like to make any changes?(Y/N)");
		
		if (changes.equals("Y"))
		{
			String userAccess = display.askQuestion("Would you like to access a user?.(Y/N)");
				if (userAccess.equals("Y"))
				{
					display.askQuestion("You will be redirected shortly.");
				}
				else
				{
					display.showMessage("Ok, have a nice day!");
				}
		}
		else
		{
			display.showMessage("Thank you have a good day!");
			
		}
	}
	
	private void employee()
	{
		display.showMessage("Hello would you like to access a user?(Y/N)");
	}

}

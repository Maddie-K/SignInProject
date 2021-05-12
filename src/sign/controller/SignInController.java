package sign.controller;

import sign.view.Popup;
import java.util.*;
import sign.view.SignFrame;

public class SignInController
{
	private Popup display;
	private SignFrame frame;
	
	private Hashtable<String, String> userCred;
	private String username;
	private String password;
	
	public SignInController()
	{
		this.display = new Popup();
		this.frame = new SignFrame(this);
		
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
		 
 				
		
		return isValid;
	}
	
	public void pages()
	{
		boolean results = false;
		  
		
	}
}


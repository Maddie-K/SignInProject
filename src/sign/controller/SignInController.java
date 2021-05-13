package sign.controller;

import sign.view.Popup;
import java.util.*;
import sign.model.SignIn;
import sign.view.SignFrame;

public class SignInController
{
	private SignFrame frame;
	private SignIn sign;
	
	public SignInController()
	{
		
	}
	
	public void start()
	{
		
	}
	
	public String interactWithSignIn(String username, String password)
	{
		String response = "";
		
		response = SignIn.login(username);
		
		return response;
	}
	
}

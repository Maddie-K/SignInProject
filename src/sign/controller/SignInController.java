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
		this.frame = new SignFrame(this);
	}
	
	public void start()
	{
		System.out.println("Successfully ran");
	}
	
	public String interactWithSignIn(String username, String password)
	{
		String response = "";
		
		response = sign.pages(username, password);
		
		return response;
	}
	
}

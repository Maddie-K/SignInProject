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
		this.sign = new SignIn();
	}
	
	public void start()
	{
	}
	
//	public SignIn getSignIn()
//	{
//		return this.sign;
//	}
	
	public String interactWithSignIn(String username, String password)
	{
		return sign.pages(username, password);
	}
	
}

package sign.controller;

import sign.view.Popup;

public class SignInController
{
	private Popup display;
	private String[][] userCred;
	private String username;
	private String password;
	
	public SignInController()
	{
		this.display = new Popup();
		this.userCred = new String[11][1];
		this.username = new String();
		this.password = new String();
	}
	
	public void start()
	{
		setupCred();
		login("Maddie", "2002");
		System.out.print("hello, world");
	}
	
	private void setupCred()
	{
		userCred[0][0] = "Maddie";
		userCred[0][1] = "2002";
		
		userCred[1][0] = "Sally";
		userCred[1][1] = "5678";
		
		userCred[2][0] = "Bill";
		userCred[2][1] = "9876";
		
		userCred[3][0] = "Jackson";
		userCred[3][1] = "5432";
		
		userCred[4][0] = "Sophie";
		userCred[4][1] = "0220";
		
		userCred[5][0] = "Bryan";
		userCred[5][1] = "0197";
		
		userCred[6][0] = "Melodie";
		userCred[6][1] = "0106";
		
		userCred[7][0] = "Cody";
		userCred[7][1] = "0983";
		
		userCred[8][0] = "Dallin";
		userCred[8][1] = "0489";
		
		userCred[9][0] = "Kathrine";
		userCred[9][1] = "0707";
		
		userCred[10][0] = "Harley";
		userCred[10][1] = "1098";
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


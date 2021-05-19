package sign.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.ArrayList;

import sign.controller.SignInController;

public class SignPanel extends JPanel
{
	private SignInController controller;
	private SpringLayout layout;
	
	private JButton submitButton;
	private JTextField entryUsername;
	private JTextField entryPassword;
	private JTextArea textArea;
	private JScrollPane signPane;
	private ArrayList<String> greetings;
	
	public SignPanel(SignInController controller)
	{
		super();
		this.controller = controller;
		this.layout = new SpringLayout();
		
		this.submitButton = new JButton("Submit");
		this.entryUsername = new JTextField("Enter Username", 15);
		this.entryPassword = new JTextField("Enter Password", 15);
		this.textArea = new JTextArea(12,30);
		this.signPane = new JScrollPane();
		this.greetings = new ArrayList<String>();
		
		setupGreetings();
		setupPanel();
		setupLayout();
		setuplisteners();

	}
	
	private void setupGreetings()
	{
		greetings.add("Hello!");
		greetings.add("Bonjour");
		greetings.add("Howdy");
		greetings.add("Guten Tag");
		greetings.add("Hello there fellow human being");
	}
	
	private String randomGreeting()
	{
		String greet = "";
		int randomSelection;
		
		randomSelection = (int) (Math.random() * greetings.size());
		
		greet = greetings.get(randomSelection);
		
		return greet;
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(209, 237, 242));
		this.setSize(400, 310);
		this.setLayout(layout);
		
		signPane.setViewportView(textArea);
		signPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		signPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setEnabled(false);
		
		this.add(submitButton);
		this.add(entryUsername);
		this.add(entryPassword);
		this.add(signPane);
		textArea.append(randomGreeting() + "\nPlease enter you username and password in the corrosponding boxes.\n");
	}
	
	private void setuplisteners()
	{
		submitButton.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent click)
			{
				
				String text  = entryUsername.getText();
				String text2 = entryPassword.getText();
				
				setupDisplay(text, text2);
			}  
		});  
		
	}
	
	private void setupDisplay(String username, String password)
	{
		String response = controller.interactWithSignIn(username, password);
		textArea.append("Username: " + username + "\n");
		textArea.append("Password: " + password + "\n");
		textArea.append("\n" + response + "\n");
		entryPassword.setText("");
		entryUsername.setText("");
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.SOUTH, submitButton, -10, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.SOUTH, entryUsername, -35, SpringLayout.SOUTH, submitButton);
		layout.putConstraint(SpringLayout.SOUTH, entryPassword, -35, SpringLayout.SOUTH, submitButton);
		layout.putConstraint(SpringLayout.NORTH, signPane, 15, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, signPane, 18, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, entryUsername, 9, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, entryPassword, 5, SpringLayout.EAST, entryUsername);
		layout.putConstraint(SpringLayout.WEST, submitButton, 155, SpringLayout.WEST, this);
		
	}
}

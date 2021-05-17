package sign.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

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
		
		
		setupPanel();
		setupLayout();
		setuplisteners();
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
	}
	
	private void setuplisteners()
	{
//		submitButton.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent click)
//			{
//				String text  = entryUsername.getText();
//				String text2 = entryPassword.getText();
//				setupDisplay(text, text2);
//			}
//		});
		
		submitButton.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent click)
			{
				
				String text  = entryUsername.getText();
				String text2 = entryPassword.getText();
				
				System.out.println(text + text2);
				
				setupDisplay(text, text2);
			}  
			});  
		
	}
	
	public void setupDisplay(String username, String password)
	{
		String response = controller.interactWithSignIn(username, password);
		textArea.append(username + "\n");
		textArea.append(password + "\n");
		textArea.append("\n" + response + "\n");
		entryPassword.setText("");
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST, submitButton, 155, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, submitButton, -10, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, entryUsername, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, entryUsername, -35, SpringLayout.SOUTH, submitButton);
		layout.putConstraint(SpringLayout.WEST, entryPassword, 50, SpringLayout.WEST, submitButton);
		layout.putConstraint(SpringLayout.SOUTH, entryPassword, -35, SpringLayout.SOUTH, submitButton);
		layout.putConstraint(SpringLayout.NORTH, signPane, 15, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, signPane, 18, SpringLayout.WEST, this);
	}
	
	private Color generateRandomColor()
	{
		Color random = null;
		
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		
		random = new Color(red, green, blue);
		
		return random;
	}
}

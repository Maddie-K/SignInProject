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
	
	private JButton submitUsername;
	private JButton submitPassword;
	private JTextField entryFeild;
	private JTextArea textArea;
	private JScrollPane signPane;
	
	public SignPanel(SignInController controller)
	{
		super();
		this.controller = controller;
		this.layout = new SpringLayout();
		
		this.submitUsername = new JButton("Username");
		this.submitPassword = new JButton("Password");
		this.entryFeild = new JTextField("Type here", 30);
		this.textArea = new JTextArea(12,30);
		this.signPane = new JScrollPane();
		
		setupPanel();
		setupLayout();
		setuplisteners();
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(75, 0, 130));
		this.setSize(400, 300);
		this.setLayout(layout);
		
		signPane.setViewportView(textArea);
		signPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		signPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setEnabled(false);
		
		this.add(submitUsername);
		this.add(submitPassword);
		this.add(entryFeild);
		this.add(signPane);
	}
	
	private void setuplisteners()
	{
		submitUsername.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String text = entryFeild.getText();
				setupDisplayUsername(text);
			}
		});
		
		submitPassword.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String text = entryFeild.getText();
				setupDisplayPassowrd(text);
			}
		});
	}
	
	private void setupDisplayUsername(String username)
	{
		//String response = controller.interactWithSignIn(username);
		textArea.append(username);
		//textArea.append("\n" + response + "\n");
		entryFeild.setText("");
	}
	
	private void setupDisplayPassowrd(String password)
	{
		//String response = controller.interactWithSignIn(password);
		textArea.append(password);
		//textArea.append("\n" + response + "\n");
		entryFeild.setText("");
	}
	
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.SOUTH, submitUsername, -10, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, entryFeild, 15, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, entryFeild, -5, SpringLayout.NORTH, submitUsername);
		layout.putConstraint(SpringLayout.WEST, entryFeild, 15, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, entryFeild, -5, SpringLayout.NORTH, submitUsername);
		layout.putConstraint(SpringLayout.NORTH, signPane, 15, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, signPane, 0, SpringLayout.WEST, entryFeild);
		layout.putConstraint(SpringLayout.WEST, submitUsername, 90, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, submitPassword, 0, SpringLayout.EAST, submitUsername);
		layout.putConstraint(SpringLayout.SOUTH, submitPassword, 0, SpringLayout.SOUTH, submitUsername);
		
	}
	
}

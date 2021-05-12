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
	private JTextField entryFeild;
	private JTextArea textArea;
	private JScrollPane signPane;
	
	public SignPanel(SignInController controller)
	{
		super();
		this.controller = controller;
		this.layout = new SpringLayout();
		
		this.submitButton = new JButton("Submit");
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
		
		this.add(submitButton);
		this.add(entryFeild);
		this.add(signPane);
	}
	
	private void setuplisteners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String text = entryFeild.getText();
			}
		});
	}
	
	private void setupDisplay(String input)
	{
		//String response = controller;
		//textArea.append(input);
		//textArea.append("\n" + response + "\n");
		//entryFeild.setText("");
	}
	
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST, submitButton, 150, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, submitButton, -10, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, entryFeild, 15, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, entryFeild, -5, SpringLayout.NORTH, submitButton);
		layout.putConstraint(SpringLayout.WEST, entryFeild, 15, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, entryFeild, -5, SpringLayout.NORTH, submitButton);
		layout.putConstraint(SpringLayout.NORTH, signPane, 15, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, signPane, 0, SpringLayout.WEST, entryFeild);
		
	}
	
}

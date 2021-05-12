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
		this.entryFeild = new JTextField("Type here", 50);
		this.textArea = new JTextArea(20,50);
		this.signPane = new JScrollPane();
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(75, 0, 130));
		this.setSize(800, 600);
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
	}
	
}

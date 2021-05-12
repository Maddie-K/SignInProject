package sign.view;

import javax.swing.JFrame;
import sign.controller.SignInController;
import sign.view.SignPanel;

public class SignFrame extends JFrame
{
	private SignInController controller;
	private SignPanel panel;
	
	public SignFrame(SignInController controller)
	{
		super();
		this.controller = controller;
		this.panel = new SignPanel(controller);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setSize(400, 300);
		this.setResizable(true);
		this.setTitle("Chat Window");
		this.setVisible(true);
	}
}

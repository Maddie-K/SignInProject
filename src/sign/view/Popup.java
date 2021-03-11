package sign.view;

import javax.swing.JOptionPane;

public class Popup
{
	/**
	 * 
	 * @param Displays a message
	 */
	public void showMessage(String message)
	{
		JOptionPane.showMessageDialog(null,  message);
	}
	/**
	 * 
	 * @param Displays a question
	 * @return user answer
	 */
	public String askQuestion(String question)
	{
		String answer = "" + JOptionPane.showInputDialog(null, question);
		
		return answer;
	}
}

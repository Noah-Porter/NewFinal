import javax.swing.JOptionPane;

public class Popup 
{

/**
* displayMessage is the normal method used to build the show a dialog box.
*/

	public void displayMessage(String text)
	{
		JOptionPane.showMessageDialog(null, text);
	}

/**
* askQuestion defines a String called answer, and calls it as an input box.
*/
	
	public String askQuestion(String text)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, text);
		
		return answer;
	}

}
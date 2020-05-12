// new

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomPanel extends JPanel
{
  private JButton sampleButton;

  public CustomPanel()
  {
    super();

    sampleButton = new JButton("Click me ");
    setupPanel();
    setupListeners();
  }

  private void setupListeners()
  {
    sampleButton.addActionListeners(new ActionListener()
    {
      public void actionPerformed(ActionEvent click)
      {
        startGame();
      }
    });
  }

  private void startGame()
  {
    setBackgroundColor(updateColor);

  }
  private void setupPanel()
  {
    this.setBackground(Color.GREEN);
    this.add(sampleButton);
  }

  private Color updateColor()
	{
		Color randomColor = null;
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		randomColor = new Color(red, green, blue);
		
		return randomColor;
	}
}
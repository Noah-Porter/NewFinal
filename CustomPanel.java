import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomPanel extends JPanel
{
  private JButton firstButton;

  public CustomPanel()
  {
    super();

    firstButton = new JButton("Click me to play trivia");
    setupPanel();
    setupListeners();
  }

  private void setupListeners()
  {
    firstButton.addActionListeners(new ActionListener()
    {
      public void actionPerformed(ActionEvent click)
      {
        
      }
    });
  }

  private void setupPanel()
  {
    this.setBackground(Color.MAGENTA);
    this.add(sampleButton);
  }
}
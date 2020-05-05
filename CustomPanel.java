import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton

public class CustomPanel extends JPanel
{
  private JButton sampleButton

  public CustomPanel()
  {
    super();

    sampleButton = new JButton("Click!");
    setupPanel();
  }

  private void setupPanel()
  {
    this.setBackground(Color.Magenta);
  }
}
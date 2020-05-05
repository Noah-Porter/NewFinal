import javax.swing.JFrame;

public class MyFrame extends JFrame
{
  private CustomPanel appPanel;

  public MyFrame()
  {
    super();
    
    appPanel = new CustomPanel();
    setupFrame();
  }

  private void setupFrame()
  {
    this.setContentPane(appPanel);
    this.setSize(1000, 1000);
    this.setTitle("Main GUI");
    this.setVisible(true);
  }
}
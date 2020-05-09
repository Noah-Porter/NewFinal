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
    this.setSize(400, 400);
    this.setTitle("My GUI");
    this.setVisible(true);
  }
}
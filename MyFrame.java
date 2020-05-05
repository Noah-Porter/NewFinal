import javax.swing.JFrame;

public class MyFrame extends JFrame
{
  public MyFrame()
  {
    super();
    setupFrame();
  }

  private void setupFrame()
  {
    this.setSize(500, 500);
    this.setTitle("Main GUI");
    this.setVisible(true);
  }
}
import javax.swing.JFrame;

public class MyFrame extends JFrame
{

/**
* Private data members used to create the main methods.
*/

  private CustomPanel appPanel;

/**
* MyFrame is the super call for the app. It builds from the CustomPanel class and is directly related to the Main.java file.
*/
  public MyFrame()
  {
    super();
    
    appPanel = new CustomPanel();
    setupFrame();
  }

/**
* setupFrame is the basic structure of the app. it uses simple calls to calculate itself.
*/

  private void setupFrame()
  {
    this.setContentPane(appPanel);
    this.setSize(400, 400);
    this.setTitle("My GUI");
    this.setVisible(true);
  }
}
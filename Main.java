import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Main
{
  public static void main(String [] args)
  {
    JOptionPane.showMessageDialog(null, "Custom Class Demo");
    // JFrame myFrame = new JFrame();
    // myFrame.setSize(400,400);
    // myFrame.setVisible(true);

    MyFrame app = new MyFrame();
  }
}
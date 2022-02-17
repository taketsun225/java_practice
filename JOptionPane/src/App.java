import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {

    // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
    // JOptionPane.showMessageDialog(null, "Here is more useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
    // JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
    // JOptionPane.showMessageDialog(null, "You're computer has A VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
    // JOptionPane.showMessageDialog(null, "Call tech support OR ELSE!!!", "title", JOptionPane.ERROR_MESSAGE);

    // int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
    // String name = JOptionPane.showInputDialog("What is your name?: ");
    // System.out.println("Hello, " + name);

    String[] responses = {"No you're awesome!", "thank you!", "*blush*"};
    ImageIcon icon = new ImageIcon("face-smile64.png");
    JOptionPane.showOptionDialog(
      null,
      "You are awesome!",
      "secret message",
      JOptionPane.YES_NO_CANCEL_OPTION,
      JOptionPane.INFORMATION_MESSAGE,
      icon, responses,
      0
    );
  }
}

import javax.swing.JOptionPane;


public class gui {
    // public static void main(String[] args) {
        
    //     // Input integer using GUI
    //     String input = JOptionPane.showInputDialog("Enter a number:");
    //     int num = Integer.parseInt(input);
        
    //     // Show the result
    //     JOptionPane.showMessageDialog(null, "You entered: " + num);
    // }
    public static void main(String[] args) {
      // String input = JOptionPane.showInputDialog("Enter a number ");
      // int n = Integer.parseInt(input);
      // System.out.println(n);
      String input = JOptionPane.showInputDialog("Enter the number ");
      int number = Integer.parseInt(input);
      JOptionPane.showMessageDialog(null, "Lowreee "+ number);
    }
}

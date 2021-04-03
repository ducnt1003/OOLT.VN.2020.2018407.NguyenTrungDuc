import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        String strA, strB;
        double a, b, c;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        strA = JOptionPane.showInputDialog(null, "Input a");
        strB = JOptionPane.showInputDialog(null, "Input b");
        a = Double.parseDouble(strA);
        b = Double.parseDouble(strB);
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Error !!!", "Solution", JOptionPane.INFORMATION_MESSAGE);
        } else {
            c = -b/a;
            JOptionPane.showMessageDialog(null, "x = " + decimalFormat.format(c), "Solution", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
        
    }
}
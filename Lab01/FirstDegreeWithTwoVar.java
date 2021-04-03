import javax.swing.JOptionPane;
public class FirstDegreeWithTwoVar {
    public static void main (String[] args) {
        String strA11, strA12, strB1;
        String strA21, strA22, strB2;
        double a11 , a12, a21, a22, b1, b2, d, d1, d2, x1, x2;
        strA11 = JOptionPane.showInputDialog(null, "Please input a11", "input the first equation"
        , JOptionPane.INFORMATION_MESSAGE);
        strA12 = JOptionPane.showInputDialog(null, "Please input a12", "input the first equation"
        , JOptionPane.INFORMATION_MESSAGE);
        strB1 = JOptionPane.showInputDialog(null, "Please input b1", "input the first equation"
        , JOptionPane.INFORMATION_MESSAGE);
        strA21 = JOptionPane.showInputDialog(null, "Please input a21", "input the second equation"
        , JOptionPane.INFORMATION_MESSAGE);
        strA22 = JOptionPane.showInputDialog(null, "Please input a22", "input the second equation"
        , JOptionPane.INFORMATION_MESSAGE);
        strB2 = JOptionPane.showInputDialog(null, "Please input b2", "input the second equation"
        , JOptionPane.INFORMATION_MESSAGE);
        a11 = Double.parseDouble(strA11);
        a12 = Double.parseDouble(strA12);
        b1 = Double.parseDouble(strB1);
        a21 = Double.parseDouble(strA21);
        a22 = Double.parseDouble(strA22);
        b2 = Double.parseDouble(strB2);
        d = a11*a22 - a12*a21;
        d1 = b1*a22 - b2*a12;
        d2 = b2*a11 - b1*a22;
        if (d != 0){
            x1 = d1/d;
            x2 = d2/d;
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2 = " +x2, "Solution", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (b1 == b2*a11/a21){
                JOptionPane.showMessageDialog(null, "Infinite Solution !!!", "Solution", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No Solution !!!!", "Solution", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
    
}

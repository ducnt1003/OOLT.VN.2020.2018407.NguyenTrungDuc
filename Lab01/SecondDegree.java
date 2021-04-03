import javax.swing.JOptionPane;
public class SecondDegree {
    public static void main (String[] args){
        String strA, strB, strC;
        double a, b, c, d, x1, x2;
        strA = JOptionPane.showInputDialog(null, "Input a", "Second-Degree Equation",JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null, "Input b", "Second-Degree Equation",JOptionPane.INFORMATION_MESSAGE);
        strC = JOptionPane.showInputDialog(null, "Input c", "Second-Degree Equation",JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(strA);
        b = Double.parseDouble(strB);
        c = Double.parseDouble(strC);
        d = b*b - 4*a*c;
        if ( d > 0 ){
            x1 = -b/2 + Math.sqrt(d)/2;
            x2 = -b/2 - Math.sqrt(d)/2;
            JOptionPane.showMessageDialog(null, "The equation has 2 solutions\nx1 = " + x1 +"\nx2 = " +x2, "Solution", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if ( d == 0){
                x1 = x2 = -b/2;
                JOptionPane.showMessageDialog(null, "The equation has 1 solution\n" + "x1 = x2 = " +x1, "Solution", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution", "Solution", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
    
}

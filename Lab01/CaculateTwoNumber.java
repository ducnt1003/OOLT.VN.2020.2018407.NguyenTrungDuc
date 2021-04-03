import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class CaculateTwoNumber {
    public static void main(String[] args){
        String strNum1, strNum2;
        double sum, dif, product, quotient;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number", "input the first number"
        , JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "input the second number"
        , JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        sum = num1 + num2;
        dif = num1 - num2;
        product = num1*num2;
        quotient = num1/num2; 
        JOptionPane.showMessageDialog(null, "Sum = " + sum +"\nDifferent = " + dif +
         "\nProduct = "  + product + "\nQuotient = " + decimalFormat.format(quotient)
        , "Operation of two number ",JOptionPane.INFORMATION_MESSAGE );
        
        System.exit(0);

    }
    
}

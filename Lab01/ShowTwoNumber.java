import javax.swing.JOptionPane;
public class ShowTwoNumber {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNofitication = "You 've just entered: ";
        strNum1 = JOptionPane.showInputDialog(null,"Plese input the first number:","Input the first number"
        ,JOptionPane.INFORMATION_MESSAGE );
        strNofitication += strNum1 + " and " ;
        strNum2 = JOptionPane.showInputDialog(null,"Plese input the second number:","Input the second number"
        ,JOptionPane.INFORMATION_MESSAGE );  
        strNofitication += strNum2 ;
        JOptionPane.showMessageDialog(null, strNofitication, "Show two numbers ",JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
}

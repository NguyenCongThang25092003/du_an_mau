package utillies;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ValidationUtil {
    
    public static boolean checkEmpty(JTextField txt,String message){
        boolean check = false;
        try {
            if(txt.getText().trim().replace(",", "").isEmpty()){
                JOptionPane.showMessageDialog(null, message);
                return check = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
    
    public static boolean checkIsNumberForBigDecimal(JTextField txt, String message){
        boolean check = true;
        BigDecimal bigDecimal = null;
        try {
            bigDecimal = new BigDecimal(txt.getText().trim());
            check = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, message);
        }
        return check;
    }
    
    public static boolean checkIsNumberForInteger(JTextField txt, String message){
        boolean check = true;
        try {
            Integer.parseInt(txt.getText().trim());
            check = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, message);
        }
        return check;
    }
}

import javax.swing.*;
import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        JOptionPane jOptionPane = new JOptionPane();
        String variableN = jOptionPane.showInputDialog(null, "Pleas enter variable n: ");
        int variableNInt = Integer.parseInt(variableN);

        extraLongFactorials(variableNInt);
    }

    public static void extraLongFactorials(int variableNInt) {
        BigInteger result = BigInteger.valueOf(variableNInt);
        for (int i = 1; i < variableNInt; i++) {
            result = result.multiply(BigInteger.valueOf(variableNInt-i));
        }
        System.out.println(result);
    }
}
//    static void extraLongFactorials(int n) {
//        BigInteger result = BigInteger.valueOf(n);
//        for (int i = 1; i < n; i++) {
//            result = result.multiply(BigInteger.valueOf(n-i));
//        }
import java.util.ArrayList;

public class Task2 {

    public static ArrayList pasteOperator() {
        char[] op = {'&', '|', '^'};
        ArrayList<String> operator = new ArrayList();
        for (int i = 0; i < op.length; i++) {
            for (int j = 0; j < op.length; j++) {
                for (int k = 0; k < op.length; k++) {
                    operator.add(String.valueOf(op[i]) + String.valueOf(op[j]) + String.valueOf(op[k]));

                }
            }
        }
        return operator;
    }

    public static ArrayList<String> printArray(ArrayList<String> arrayList) {
        ArrayList<String> newArray = new ArrayList<String>();
        int i = 1;
        for (String string : arrayList) {
            System.out.println(i + string);
            i++;
            char[] symbol = string.toCharArray();
            newArray.add("a" + (symbol[0]) + "b" + (symbol[1]) + "c" + (symbol[2]) + "d");
        }
        int l = 1;
        for (String el : newArray) {
            System.out.println(l + "." + el);
            l++;
        }
        return newArray;
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean result = ((a == b) == (c == d)) & (!(a & b & c & d)) & (!(!a & !b & !c & !d));
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {


        printArray(pasteOperator());

        booleanExpression(true, true, false, false); //true
        booleanExpression(true, false, true, false); //true
        booleanExpression(true, false, false, true); //true
        booleanExpression(false, true, true, false); //true
        booleanExpression(false, true, false, true); //true
        booleanExpression(false, false, true, true); //true
        booleanExpression(false, false, false, false);//false
        booleanExpression(true, false, false, false); //false
        booleanExpression(false, true, false, false); //false
        booleanExpression(false, false, true, false); //false
        booleanExpression(false, false, false, true); //false
        booleanExpression(true, true, true, false);  //false
        booleanExpression(false, true, true, true);  //false
        booleanExpression(true, true, true, true);  //false

    }
}

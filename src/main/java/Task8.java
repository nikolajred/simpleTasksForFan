import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static int numberOfArrayElementsInt;


    public static boolean isNumeric(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    public static int[] initializeArray() {
        String numberOfArrayElements = JOptionPane.showInputDialog("Pleas input number of the array elements: ");
//        try {
//            int numberOfArrayElementsInt = Integer.valueOf(numberOfArrayElements);
//            System.out.println(numberOfArrayElementsInt);
//        } catch (NumberFormatException e) {
//            System.out.println("You input not correct value");
//        }
        if (isNumeric(numberOfArrayElements)) {
            numberOfArrayElementsInt = Integer.valueOf(numberOfArrayElements);
        } else {
            System.out.println("You input not correct value");
        }
        int[] array = new int[numberOfArrayElementsInt];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
//            System.out.println("Pleas input element № " + i);
//            array[i] = scanner.nextInt();
            String element = JOptionPane.showInputDialog("Pleas input element №" + i);
            if (isNumeric(element)) {
                array[i] = Integer.valueOf(element);
            } else {
                System.out.println("You input not correct value");
            }
        }
        return array;
    }

    public static void reversArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = initializeArray();
        printArray(array);
        reversArray(array);
        printArray(array);

    }


}

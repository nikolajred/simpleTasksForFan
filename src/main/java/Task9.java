import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static int[] initializeArray(int length) {
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.println("Pleas input element of array");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] rewriteArray(int[] array) {
        int temp = 0;
        int[] arrayZero = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                temp++;
            }
        }
                arrayZero = new int[temp];
                int temp1 = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == 0) {
                        arrayZero[temp1] = j;
                        temp1++;
                    }
            }
            System.out.println(Arrays.toString(arrayZero));

        return arrayZero;
    }

    public static void main(String[] args) {
        rewriteArray(initializeArray(4));

    }
}

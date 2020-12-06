import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static int[] array;
    public static int[] initialisationSequence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите число элементов последовательности: ");
        int numberOfElements = scanner.nextInt();
        array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Пожалуйста введите элемент № " + i);
            array[i] = scanner.nextInt();
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        return array;
    }
    public static String checkedIncrease(int[] array) {
        String result = "Последовательность возростающая";
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] <= array[j]) {
                    continue;
                } else {
                    System.out.println("Элемент №"+ i + " = " + array[i] + " > элемента №" + j + " = " + array[j]);
                    result = "Последовательность не возростающая";
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        checkedIncrease(initialisationSequence());
    }
}

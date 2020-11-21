import java.util.Scanner;

public class Task3 {
    public static int quantityOfSigns;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожайлуста введите целое чесло n которое >=0 или <= 10^9: ");
        long guessNumber = scanner.nextLong();
        if(guessNumber>=0 || guessNumber <= Math.pow(10, 9)){
            while (guessNumber>0){
                guessNumber/=10;
                quantityOfSigns++;

            }
            System.out.println("Колличество знаков в вашем чесле равно числу: " + quantityOfSigns);

        }else{
            System.out.println("Вы ввели некорректное число повторите ввод: ");
        }

    }
}

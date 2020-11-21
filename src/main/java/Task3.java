import java.util.Scanner;

public class Task3 {
    public static int
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожайлуста введите целое чесло n которое >=0 или <= 10^9: ");
        int guesNumber = scanner.nextInt();
        while (guesNumber>0){
            guesNumber/=10;
        }
    }
}

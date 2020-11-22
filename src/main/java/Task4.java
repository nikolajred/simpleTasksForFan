import java.util.Scanner;

public class Task4 {
    public static int leapYearCount(int year){
        return (year/4)-(year/100)+(year/400);
    }
    public static void main(String[] args) {
        System.out.println("Введите пожалуйста год: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int leapCountYear = leapYearCount(year);
        System.out.println("Начиная с 1 года н.э. до года который вы ввели " +
                "колличестово высокосных годов составляет: " + leapCountYear);

    }
}

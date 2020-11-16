import java.util.Scanner;

public class Task1 {
    public static int inputNumber;
    public static String resultNumber;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите положительное двухзначное число от 10 до 99 включительно: ");
        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                inputNumber = scanner.nextInt();
                if(inputNumber>=10&&inputNumber<=99){
                    System.out.println("Ваше число равно: " + inputNumber);
                    break;
                }else {
                    System.out.println("Вы ввели некорректное число, повторите ввод");
                }

            }else{
                System.out.println("Вы ввели не числовое значение, попробуйте вследующий раз");
                break;
            }

        }
        resultNumber = (inputNumber/10) + " " +(inputNumber%10);
        System.out.println("Два одноцифровых числа, разделенных пробелом "+ resultNumber);

    }
}

import java.util.Random;
import java.util.Scanner;
public class Bingo {

    public static void main(String[] args) {
        System.out.println("Угадай число от 0 до 100.");
        Random random = new Random();
        int x = random.nextInt(101);
        int number, counter = 0;
        int a = 0;
        do {
            counter++;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите ваше число: ");
            number = in.nextInt();
            if (number > x)
                System.out.println("Моё число меньше.");
            else if (number < x) System.out.println("Моё число больше.");
            else System.out.println("Вы угадали!");
            if (number != x)
            {System.out.print("Хочешь выйти - введи 1, продолжить - введи любую цифру кроме 1: ");
            a = in.nextInt();}
        }
        while (number != x && a != 1);
        System.out.println("Количество попыток: " + counter);
        System.out.println("Конец. Верное число: " + x);

    }
}






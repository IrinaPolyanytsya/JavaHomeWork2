import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение для расчета интервала от 1 до 100:");
        int x = in.nextInt ();
         {
             if (x>100) {
                 System.out.print ("Не верный запрос. Введите значения от 1-100");}
            else if (x<=14)
             {System.out.print ("Результат вычисления: [0 -14]");}
            else if (x>=15 && x<=35)
             {System.out.print ("Результат вычисления: [15 - 35]");}
            else if (x>=36 && x<=50)
             {System.out.print ("Результат вычисления: [36 - 50]");}
            else if (x>=51 && x<=100)
             {System.out.print ("Результат вычисления: [51 - 100]");}

        }
    }
}

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1 ;
        int operand2 ;
        String znak;
        Scanner in = new Scanner(System.in);
        System.out.print("введите 2 числа для расчетов: ");
        operand1  = in.nextInt();
        operand2  = in.nextInt();
        System.out.print("\nВведите арифметический знак (+, -, *, /): ");
        znak = in.next();
        switch(znak) {
            case "+":
                System.out.print ("Результат вычисления:"+(operand1 + operand2));
                break;
            case "-": System.out.print ("Результат вычисления:"+(operand1 - operand2));
                break;
            case "*": System.out.print ("Результат вычисления:"+(operand1 * operand2));
                break;
            case "/":
            if (operand2 == 0)
                System.out.print ("Ошибка! На ноль делить нельзя");
            else
                System.out.print ("Результат вычисления:"+(operand1 / operand2));
        }
    }
}

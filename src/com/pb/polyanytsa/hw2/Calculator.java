import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double operand1 ;
        double operand2 ;
        double otvet;
        char znak;
        Scanner reader = new Scanner(System.in);
        System.out.print("введите 2 числа для расчетов: ");
        operand1  = reader.nextDouble();
        operand2  = reader.nextDouble();
        System.out.print("\nВведите арифметический знак (+, -, *, /): ");
        znak = reader.next().charAt(0);
        switch(znak) {
            case '+': otvet = operand1  + operand2 ;
                break;
            case '-': otvet = operand1  - operand2 ;
                break;
            case '*': otvet = operand1  * operand2 ;
                break;
            case '/': otvet = operand1  / operand2 ;
                break;
            default:  System.out.printf("Ошибка");
                return;
        }
        System.out.print("\nРезультат вычисления:\n");
        System.out.printf(operand1  + " " + znak + " " + operand2  + " = " + otvet);
    }
}
package Lesson1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");   // Вывод на консоль текста Enter the first number: /
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the next number: ");    //Вывод на консоль текста Enter the next number:
        double nextNumber = scanner.nextDouble(); //Ввод с консоли второго числа

        System.out.print("Enter the operation: ");
        char action = scanner.next().charAt(0);

        scanner.close(); // закрытие метода ввода

        switch (action) {
            case '+':
                System.out.print("Addition: ");
                System.out.printf("%.4f", firstNumber + nextNumber);
                break;
            case '-':
                System.out.print("Subtraction: ");
                System.out.printf("%.4f", firstNumber - nextNumber);
                break;
            case '*':
                System.out.print("Multiplication: ");
                System.out.printf("%.4f", firstNumber * nextNumber);
                break;
            case '/':
                System.out.print("Division: ");
                System.out.printf("%.4f", firstNumber / nextNumber);
                break;
            default:
                System.out.print("Please enter + or - or * or / ");
        }
    }
}

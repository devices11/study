package Lesson3;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        input.inputValues(scanner);
        scanner.close();

        MathOperation mathOperation = new MathOperation(input.getInputFirstNumber(),input.getInputNextNumber(), input.getInputAction());
        System.out.print("Result: " + mathOperation.addition());

    }
}

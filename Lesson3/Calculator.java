package Lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();

        try {
            input.inputValues(scanner);
            scanner.close();
        } catch (InputMismatchException e){
            System.err.print("Error. Entered incorrect values!" + "\n");
        }

        MathOperation mathOperation = new MathOperation(input.getInputFirstNumber(),input.getInputNextNumber(), input.getInputAction());
        System.out.print("Result: " + mathOperation.addition());

    }
}

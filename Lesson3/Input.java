package Lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private double inputFirstNumber;
    private double inputNextNumber;
    private char inputAction;

    public double getInputFirstNumber() {
        return inputFirstNumber;
    }

    public double getInputNextNumber() {
        return inputNextNumber;
    }

    public char getInputAction() {
        return inputAction;
    }

    private void setFirstNumber(double inputFirstNumber) {
        this.inputFirstNumber = inputFirstNumber;
    }

    private double inputFirstNumber (Scanner scanner){
        setFirstNumber(scanner.nextDouble());
        return inputFirstNumber;
    }

    private void setInputNextNumber(double inputNextNumber){
        this.inputNextNumber = inputNextNumber;
    }

    private double inputNextNumber(Scanner scanner){
        setInputNextNumber(scanner.nextDouble());
        return inputNextNumber;
    }

    private void setInputAction(char inputAction) {
        this.inputAction = inputAction;
    }

    private char inputAction(Scanner scanner){
        setInputAction(scanner.next().charAt(0));
        return inputAction;
    }

    public Input inputValues(Scanner scanner) {
        System.out.print("Enter the first number: ");
        inputFirstNumber(scanner);
        System.out.print("Enter the next number: ");
        inputNextNumber(scanner);
        System.out.print("Enter the operation: ");
        inputAction(scanner);
        return this;
    }
}

package Lesson3;

public class MathOperation {
    private double firstNum;
    private double nextNum;
    private char action = '+';
    private double result;

    public MathOperation(double firstNum, double nextNum, char action) {
        this.firstNum = firstNum;
        this.nextNum = nextNum;
        this.action = action;
    }

    public double addition(){
        if(action == '+'){
            result = firstNum + nextNum;
        } else if (action == '-') {
            result = firstNum - nextNum;
        } else if (action == '*') {
            result = firstNum * nextNum;
        } else if (action == '/') {
            result = firstNum / nextNum;
        }
        return result;
    }
}
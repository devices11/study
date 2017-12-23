package Lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Valentin Izotov
 * @see Scanner - import class for input
 */

public class base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter program:" + "\n" + "1 - Calculator" + "\n" + "2 - String array" + "\n" + "3 - Christmas Gift");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                calc();
                break;
            case 2:
                swapMinMax();
                break;
            case 3:
                christmasGift();
                break;
            default:
                System.out.print("Please enter  1 or 2 or 3");
        }
    }

    //метод калькулятор
    private static double calc() {
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

        return 0;
    }


    //             задание 2: Поиск максимального элемента в массиве
    public static int[] swapMinMax() {

        // рандомный массив
        System.out.println("Random array: ");
        int[] array_minmax = new int[20];
        for (int i = 0; i < 20; i++) {
            array_minmax[i] = (int) (Math.random() * 21 - 10);
        }
        String array_minmaxStr = Arrays.toString(array_minmax);
        System.out.println(array_minmaxStr);

        // поиск индекса минимального и максимального числа в массиве
        int array_min = 0;
        int array_max = 0;
        for (int j = 1; j < 20; j++) {
            if (array_minmax[j] > array_minmax[array_max]) {
                array_max = j;
            } else if (array_minmax[j] < array_minmax[array_min]) {
                array_min = j;
            }
        }

        // замена min max
        int min = array_minmax[array_min];
        int max = array_minmax[array_max];
        for (int swap = 0; swap < array_minmax.length; swap++) {
            if (array_minmax[swap] == max) {
                array_minmax[swap] = min;
            } else if (array_minmax[swap] == min) {
                array_minmax[swap] = max;
            }

        }
        System.out.println("Swap min max array: ");
        String array_minmaxStr2 = Arrays.toString(array_minmax);
        System.out.println(array_minmaxStr2);
        return array_minmax;

    }

    public static void christmasGift() {

        String[] goods = {
                "1. Драже жевательное Bubbly Bottles со вкусом шампанского",
                "2. Драже жевательное Сливочный Поп-Корн",
                "3. Конфеты ассорти со вкусами кислых фруктов Go Sour!",
                "4. Конфеты Гарри Поттера Берти Боттс в коробке",
                "5. Диспенсер с конфетами Bean Boozled: 16 неожиданных вкусов"};
        int[] id = {1, 2, 3, 4, 5};
        int[] weight = {42, 49, 125, 35, 99};
        int[] cost = {225, 199, 635, 275, 915};

        System.out.println("Select product: ");
        for (int prGoods = 0; prGoods < goods.length; prGoods++) {
            System.out.println(goods[prGoods]);
        }

        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;
        int totalWeight = 0;

        System.out.println("Enter the item number. To complete your purchase, enter 0");
        ArrayList<Integer> gifts = new ArrayList<Integer>();
        for (; ; ) {
            int s = scanner.nextInt();
            int g = 0;
            while (g < id.length) {
                if (s == id[g]) {
                    gifts.add(s);
                    totalCost += cost[g];
                    totalWeight += weight[g];
                }
                g++;
            }
            if (s == 0) {
                break;
            }
        }
        scanner.close();

        System.out.println("Your gift:");
        for (int prGift = 0; prGift < gifts.size(); prGift++) {
            for (int f = 0; f < id.length; f++) {
                if (gifts.get(prGift) == id[f]) {
                    System.out.println(goods[f]);
                }
            }
        }

        System.out.println("Total weight: " + totalWeight + " gr.");

        System.out.println("Total cost: " + totalCost + " rub.");
    }
}

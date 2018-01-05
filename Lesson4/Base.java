package Lesson4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите полный путь к файлу: ");
        StringBuffer content = new StringBuffer();

        while (content.length() == 0){
            String filepath = scanner.nextLine();
            try{
                Scanner fileScanner = new Scanner(new File(filepath));
                while (fileScanner.hasNext()){
                    content.append(fileScanner.nextLine() + " ");
                }
            }catch (IOException e){
                System.err.println("Ошибка! Не удалось прочесть файл или он пустой, попробуйте снова.");
            }
        }

        ArrayList<String> words = Analyser.handlerFile(new String(content));
        Analyser.analyse(words);
    }
}

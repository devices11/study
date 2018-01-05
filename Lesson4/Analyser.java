package Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Analyser {

    public static ArrayList<String> handlerFile(String content){

        content = content.replaceAll("[^А-яЁёA-z0-9]+", " ");
        String[] words = content.split(" ", -1);
        ArrayList<String> contentList = new ArrayList<String>();

        for (int index = 0; index < words.length; index++){
            if (!words[index].equals(""))contentList.add(words[index]);
        }
        return contentList;
    }

    public static void analyse(ArrayList<String> words){
        HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
        String popularWord = null;

        for (String word: words){
            word = word.toLowerCase();
            if (wordsCount.containsKey(word)){
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                if(popularWord == null)popularWord = word;
                wordsCount.put(word, 1);
            }
            if(wordsCount.get(word) > wordsCount.get(popularWord)) popularWord = word;
        }

        String[] sortedArray = wordsCount.keySet().toArray(new String[0]);
        Arrays.sort(sortedArray);

        System.out.println("\nСамое популярное слово - " + popularWord + "\nПовторяется " + wordsCount.get(popularWord) + " раз(а)\n");
        for (int index = 0; index < sortedArray.length; index++){
            System.out.print(sortedArray[index] + "(" + wordsCount.get(sortedArray[index]) + ")" + "\n" );
        }
    }
}

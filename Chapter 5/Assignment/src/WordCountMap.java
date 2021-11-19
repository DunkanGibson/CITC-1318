import java.io.*;
import java.util.*;

public class WordCountMap {

    public static void main(String[] args) {

        Scanner scanner;
        try {
            scanner = new Scanner(new File("C:/FactBook2008.txt"));


            Map<String, Integer> wordCount = new TreeMap<String, Integer>();

            while (scanner.hasNext()) {

                String word = scanner.next();

                if (!wordCount.containsKey(word)) {
                    wordCount.put(word, 1);
                }
                else {
                    wordCount.put(word, wordCount.get(word) + 1);
                }
            }

            for (String word : wordCount.keySet()) {
                System.out.println(word + " " + wordCount.get(word));

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not available");
        }
    }
}
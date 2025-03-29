package bridgelabz.mapInterface;

import java.io.*;
import java.util.*;

class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "D:\\8th sem\\bridgelabz.workspace\\java-collections\\src\\main\\java\\bridgelabz\\mapInterface\\input.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                String word = scanner.next();
                String cleanWord = "";

                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (Character.isLetter(c)) {
                        cleanWord += Character.toLowerCase(c);
                    }
                }

                if (!cleanWord.isEmpty()) {
                    if (wordCount.containsKey(cleanWord)) {
                        wordCount.put(cleanWord, wordCount.get(cleanWord) + 1);
                    } else {
                        wordCount.put(cleanWord, 1);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println(wordCount);
    }
}

//{the=1, hi=1, frequncy=1, of=1, count=2, words=3, it=1}
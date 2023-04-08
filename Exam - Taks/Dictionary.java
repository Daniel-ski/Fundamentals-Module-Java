package Exam;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] allWordsAndDefinitons = inputLine.split("\\s+\\|\\s+");
        Map<String, List<String>> wordDefiniton = new LinkedHashMap<>();

        for (String currentWord : allWordsAndDefinitons) {
            String word = currentWord.split(": ")[0];
            String definiton = currentWord.split(": ")[1];

            wordDefiniton.putIfAbsent(word, new ArrayList<>());
            wordDefiniton.get(word).add(definiton);
        }
        String[] wordToTest = scanner.nextLine().split("\\s+\\|\\s+");
        String inputCommand = scanner.nextLine();

        if (inputCommand.equals("Test")) {
            for (String word : wordToTest) {
                if (wordDefiniton.containsKey(word)) {
                    System.out.printf("%s:%n", word);

                    for (String definition : wordDefiniton.get(word)) {
                        System.out.printf("-%s%n", definition);
                    }
                }
            }

        } else if (inputCommand.equals("Hand Over")) {
            for (Map.Entry<String, List<String>> word : wordDefiniton.entrySet()) {
                System.out.print(word.getKey() + " ");
            }

        }
    }
}

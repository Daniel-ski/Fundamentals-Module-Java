package Final_Exam_Peparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class x02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern digits = Pattern.compile("\\d");
        Matcher digitsMatcher = digits.matcher(input);
        long thresholdSum = 1;

        while (digitsMatcher.find()) {
            thresholdSum *= Integer.parseInt(digitsMatcher.group());
        }
        System.out.printf("Cool threshold: %d%n", thresholdSum);

        Pattern emojiPattern = Pattern.compile("([:]{2}|[*]{2})(?<text>[A-Z][a-z]{2,})(\\1)");
        Matcher emojiMatcher = emojiPattern.matcher(input);
        int emojiCounter = 0;
        List<String> emojiList = new ArrayList<>();

        while (emojiMatcher.find()) {
            emojiCounter++;
            String currentEmoji = emojiMatcher.group("text");
            String fullEmojiName = emojiMatcher.group();
            int currentEmojiSum = 0;

            for (char character : currentEmoji.toCharArray()) {
                currentEmojiSum += (int) character;
            }
            if (currentEmojiSum >= thresholdSum) {
                emojiList.add(fullEmojiName);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiCounter);
        for (String emoji : emojiList) {
            System.out.println(emoji);
        }
    }
}

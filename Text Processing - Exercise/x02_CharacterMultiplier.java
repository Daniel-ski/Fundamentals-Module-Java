package TextProcessing_Exercise;

import java.util.Scanner;

public class x02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] names = inputLine.split("\\s+");

        int maxLength = Math.max(names[0].length(), names[1].length());
        int minLength = Math.min(names[0].length(), names[1].length());

        int sum = 0;

        for (int index = 0; index < minLength; index++) {
            sum += names[0].charAt(index) * names[1].charAt(index);
        }

        if (maxLength == minLength) {
            System.out.println(sum);
            return;
        }

        if (maxLength == names[0].length()) {
            for (int index = minLength; index < maxLength; index++) {
                sum += names[0].charAt(index);
            }
        } else {
            for (int index = minLength; index < maxLength; index++) {
                sum += names[1].charAt(index);
            }
        }
        System.out.println(sum);

    }

}


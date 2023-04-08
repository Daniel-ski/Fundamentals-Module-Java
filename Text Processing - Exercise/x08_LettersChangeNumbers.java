package TextProcessing_Exercise;

import java.util.Scanner;

public class x08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String code : inputString) {
            sum += getModifiedNum(code);

        }
        System.out.printf("%.2f", sum);
    }

    public static double getModifiedNum(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double num = Integer.parseInt(code.substring(1, code.length() - 1));
        // double number = Double.parseDouble(code.replace(letterBefore, ' ') //" 12b"
        //                         .replace(letterAfter, ' ') //" 12 "
        //                         .trim()); //"12" -> 12

        if (Character.isUpperCase(firstLetter)) {
            int numOfAlphabet = (int) firstLetter - 64;

            num = num / numOfAlphabet;
        } else if (Character.isLowerCase(firstLetter)) {
            int numOfAlphabet = (int) firstLetter - 96;

            num = num * numOfAlphabet;
        }

        if (Character.isUpperCase(secondLetter)) {
            int numOfAlphabet = (int) secondLetter - 64;

            num = num - numOfAlphabet;
        } else if (Character.isLowerCase(secondLetter)) {
            int numOfAlphabet = (int) secondLetter - 96;

            num = num + numOfAlphabet;
        }

        return num;
    }
}

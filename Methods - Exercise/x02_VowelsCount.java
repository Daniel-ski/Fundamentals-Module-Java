package Methods_Exercise;

import java.util.Scanner;

public class x02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine().toLowerCase();

        printVowelsCount(inputText);



    }
    public static void printVowelsCount (String input) {

        int counter = 0;

        for (char symbol : input.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' ) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}


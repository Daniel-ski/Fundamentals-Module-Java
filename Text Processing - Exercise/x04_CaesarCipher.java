package TextProcessing_Exercise;

import java.util.Scanner;

public class x04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char currentSymbol : inputLine.toCharArray()){
            char encrypted = (char) (currentSymbol + 3);

            sb.append(encrypted);
        }
        System.out.println(sb);
    }
}

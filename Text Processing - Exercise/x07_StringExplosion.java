package TextProcessing_Exercise;

import java.util.Scanner;

public class x07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        StringBuilder sb = new StringBuilder(inputLine);
        int totalStrength = 0;

        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);

            if (currentChar == '>'){
                int strength = Integer.parseInt(sb.charAt(i+1) + "");
               
                totalStrength += strength;
                } else if (currentChar != '>' && totalStrength > 0) {
                sb.deleteCharAt(i);
                totalStrength --;
                i --;
            }
        }
        System.out.print(sb);
    }
}

package TextProcessing_Exercise;

import java.util.Scanner;

public class x06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        StringBuilder inputBuilder = new StringBuilder(inputLine);

        for (int index = 0; index < inputBuilder.length() - 1 ; index++) {
            if(inputBuilder.charAt(index) == inputBuilder.charAt(index + 1)) {
                inputBuilder.deleteCharAt(index + 1);
                index--;
            }
        }
        System.out.println(inputBuilder);

   /*    StringBuilder sb = new StringBuilder(inputLine);
        StringBuilder sbReplace = new StringBuilder();

        boolean equals = false;
        int counter = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.length() == 1) {
                sbReplace.append(sb.charAt(i));
                System.out.println(sbReplace.toString());
                return;
            }
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                counter++;
                equals = true;
                if (sb.length() == 2) {
                    sbReplace.append(sb.charAt(i));
                    System.out.println(sbReplace.toString());
                    return;
                }
            } else {
                equals = false;
            }
            if (!equals) {
                sbReplace.append(sb.charAt(i));
                sb.delete(0, counter + 1);
                counter = 0;
                i = -1;
            }
        }

    */

    }
}

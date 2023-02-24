package Methods_Exercise;

import java.util.Scanner;

public class x04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (symbolCountTest(input) && lettersAndDigitTest(input) && containsTwoDigitTest(input)){
            System.out.println("Password is valid");
        }else {
            if (!symbolCountTest(input)){
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!lettersAndDigitTest(input)){
                System.out.println("Password must consist only of letters and digits");
            }
            if (!containsTwoDigitTest(input)){
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    public static boolean symbolCountTest(String text) {

            return (text.length() >= 6 && text.length() <= 10);
    }

    public static boolean lettersAndDigitTest(String text) {
        boolean isValid = false;
        for (int i = 0; i < text.length(); i++) {

            int currentChar = text.charAt(i);

            if ((currentChar >= 48 && currentChar <= 57) || (currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122)) {
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public static boolean containsTwoDigitTest(String text){
        int counterDigits = 0;

        for (int i = 0; i < text.length(); i++) {

            if ((text.charAt(i) >= 48 && text.charAt(i) <= 57)) {
                counterDigits++;
            }
        }
            return  (counterDigits >= 2);
    }
}

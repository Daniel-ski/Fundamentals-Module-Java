package TextProcessing_Exercise;

import java.util.Scanner;

public class x01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(", ");

        for (int username = 0; username < inputLine.length; username++) {
           if (validUsername(inputLine[username])){
               System.out.println(inputLine[username]);
           }

        }
    }

    public static boolean validUsername  (String username){
        boolean IsValid = false;

        if ((username.length() >= 3 && username.length() <= 16) ){
            for (int i = 0; i < username.length() ; i++) {
                char currentChar = username.charAt(i);

                if (Character.isDigit(currentChar) || Character.isLetter(currentChar) || currentChar == 45 || currentChar == 95){
                    IsValid = true;
                }else {
                    IsValid = false;
                    break;
                }

            }
        }
        return IsValid;
    }
}

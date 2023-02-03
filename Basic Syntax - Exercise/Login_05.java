package BasicSyntax_Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String validPassword = "";

        for (int i = username.length(); i >= 1 ; i--) {
            char currentChar = username.charAt(i-1);
            validPassword = validPassword + currentChar;

        }

        String password = scanner.nextLine();
        int tryCounter = 0;

        while (!password.equals(validPassword)){
            tryCounter ++;

            if (tryCounter == 4){
                System.out.println("User " + username + " blocked!");
                break;
            }
            System.out.println("Incorrect password. Try again.");

            password = scanner.nextLine();

        }
        if (tryCounter <= 3){
            System.out.printf("User %s logged in.",username);
        }
    }
}

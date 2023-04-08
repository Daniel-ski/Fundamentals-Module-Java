package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Encrypting_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern passwordPattern = Pattern.compile("^(.+)>(?<first>\\d{3})\\|(?<second>[a-z]{3})\\|(?<third>[A-Z]{3})\\|(?<fourth>[^><]{3})<(\\1)$");

        for (int i = 0; i < n ; i++) {
            String inputLine = scanner.nextLine();

            Matcher passwordMatcher = passwordPattern.matcher(inputLine);

            if (passwordMatcher.find()){
                String firstGroup = passwordMatcher.group("first");
                String secondGroup = passwordMatcher.group("second");
                String thirdGroup = passwordMatcher.group("third");
                String fourthGroup = passwordMatcher.group("fourth");
                String passwordEncrypting = String.join("",firstGroup+secondGroup+thirdGroup+fourthGroup);

                System.out.printf("Password: %s%n",passwordEncrypting);
            }else {
                System.out.printf("Try another password!%n");
            }
        }

    }
}

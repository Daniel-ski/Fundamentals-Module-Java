package RegularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class x06_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Pattern emailPattern = Pattern.compile("(?<user>[A-Za-z0-9]+[.,-_]?[A-Za-z0-9]+)@(?<host>(?<word1>[A-Za-z]+-?[A-Za-z]+)(?<word2>\\.[A-Za-z]+-?[A-Za-z0-9]+)+)");
        Matcher matcher = emailPattern.matcher(inputLine);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

package RegularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class x03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;
        String inputLine = scanner.nextLine();
        Pattern pattern = Pattern.compile("%(?<customer>[A-Z][a-z]*)%[^\\|\\.\\$\\%]*<(?<product>\\w+)>[^\\|\\.\\$\\%]*\\|(?<count>\\d+)\\|[^\\|\\.\\$\\%]*?(?<price>\\d+\\.?\\d*)\\$");

        while (!inputLine.equals("end of shift")){
            Matcher matcher = pattern.matcher(inputLine);
            if (matcher.find()){
                double currentPrice = Double.parseDouble(matcher.group("count")) * Double.parseDouble( matcher.group("price"));
                totalPrice += currentPrice;
                System.out.printf("%s: %s - %.2f%n", matcher.group("customer"),matcher.group("product"),currentPrice);
            }

            inputLine = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalPrice);
    }
}

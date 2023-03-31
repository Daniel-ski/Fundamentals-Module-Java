package RegularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class x05_NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] demonsName = inputLine.split("\\s*,\\s*");

        for (String name : demonsName) {

            int currentDemonHealth = getCurrentDemonHealth(name);
            double currentDemonDamage = currentDemonDamage(name);

            System.out.printf("%s - %d health, %.2f damage%n", name, currentDemonHealth, currentDemonDamage);
        }
    }

    private static double currentDemonDamage(String demonsName) {
        Pattern demonsDamage = Pattern.compile("\\+?\\-?\\d+\\.?\\d*");
        Matcher damageMatcher = demonsDamage.matcher(demonsName);

        double currentDemonDamage = 0;

        while (damageMatcher.find()) {
            double currentDamage = Double.parseDouble(damageMatcher.group());
            currentDemonDamage += currentDamage;
        }
        for (Character symbol : demonsName.toCharArray()) {
            if (symbol == '/') {
                currentDemonDamage /= 2;
            } else if (symbol == '*') {
                currentDemonDamage *= 2;
            }
        }
            return currentDemonDamage;

    }

    private static int getCurrentDemonHealth(String demonsName) {
        Pattern demonsHealth = Pattern.compile("[^\\d+*-\\/.]");
        Matcher healthMatcher = demonsHealth.matcher(demonsName);

        int currentDemonHealth = 0;

        while (healthMatcher.find()) {
            char currentChar = healthMatcher.group().charAt(0);

            currentDemonHealth += currentChar;
        }
        return currentDemonHealth;
    }
}

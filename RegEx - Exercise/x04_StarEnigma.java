package RegularExpressions_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class x04_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackersPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        int attackCounter = 0;
        int destroyCounter = 0;

        for (int i = 1; i <= n; i++) {
            String inputLine = scanner.nextLine();

            Pattern pattern = Pattern.compile("[starSTAR]");
            Matcher matcher = pattern.matcher(inputLine);

            int currentKey = 0;
            while (matcher.find()) {
                currentKey++;
            }

            StringBuilder decryptMessage = new StringBuilder();

            for (char currentChar : inputLine.toCharArray()) {
                char decryptChar = (char) ((int) currentChar - currentKey);
                decryptMessage.append(decryptChar);
            }

            Pattern decryptPattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@!:>-]*:(?<population>\\d+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldier>\\d+)");
            Matcher decryptMatcher = decryptPattern.matcher(decryptMessage);
            if (decryptMatcher.find()) {
                if (decryptMatcher.group("attack").equals("A")) {
                    attackersPlanets.add(decryptMatcher.group("name"));
                    attackCounter++;
                } else if (decryptMatcher.group("attack").equals("D")) {
                    destroyedPlanets.add(decryptMatcher.group("name"));
                    destroyCounter++;
                }
            }
        }

        System.out.println("Attacked planets: " + attackersPlanets.size());
        Collections.sort(attackersPlanets);
        attackersPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }
}


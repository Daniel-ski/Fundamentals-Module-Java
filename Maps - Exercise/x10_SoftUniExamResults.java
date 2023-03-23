package Maps_Lambda_StreamAPI_Ex;

import java.util.*;

public class x10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userData = new LinkedHashMap<>();
        Map<String, Integer> languageStatistics = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("exam finished")) {
            String currentStudentName = inputLine.split("-")[0];

            if (inputLine.split("-")[1].equals("banned")) {
                userData.remove(currentStudentName);
            } else {
                String currentLanguage = inputLine.split("-")[1];
                int currentPoints = Integer.parseInt(inputLine.split("-")[2]);

                userData.putIfAbsent(currentStudentName, currentPoints);
                if (currentPoints > userData.get(currentStudentName)) {
                    userData.put(currentStudentName, currentPoints);
                }
                languageStatistics.putIfAbsent(currentLanguage, 0);
                languageStatistics.put(currentLanguage, languageStatistics.get(currentLanguage) + 1);
            }

            inputLine = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : userData.entrySet()) {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        }

        System.out.println("Submissions:");
        languageStatistics.entrySet().forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));
    }
}

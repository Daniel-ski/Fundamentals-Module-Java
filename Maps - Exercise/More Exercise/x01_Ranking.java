package Maps_Lambda_StreamAPI_MoreEx;

import java.util.*;

public class x01_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        Map<String, String> contestData = new LinkedHashMap<>();


        while (!inputLine.equals("end of contests")) {
            String contestName = inputLine.split(":")[0];
            String contestPass = inputLine.split(":")[1];

            contestData.put(contestName, contestPass);

            inputLine = scanner.nextLine();
        }
        String secondInputLine = scanner.nextLine();
        Map<String, Map<String, Integer>> studentsData = new TreeMap<>();

        while (!secondInputLine.equals("end of submissions")) {
            String contestName = secondInputLine.split("=>")[0];
            String contestPass = secondInputLine.split("=>")[1];
            String studentName = secondInputLine.split("=>")[2];
            int studentPoints = Integer.parseInt(secondInputLine.split("=>")[3]);

            if (contestData.containsKey(contestName) && contestData.get(contestName).equals(contestPass)) {

                if (!studentsData.containsKey(studentName)) {
                    studentsData.put(studentName, new TreeMap<>());
                    studentsData.get(studentName).put(contestName, 0);
                } else if (!studentsData.get(studentName).containsKey(contestName)) {
                    studentsData.get(studentName).put(contestName, 0);

                }

                if (studentsData.get(studentName).get(contestName) < studentPoints) {
                    studentsData.get(studentName).put(contestName, studentPoints);
                }
            }

            secondInputLine = scanner.nextLine();
        }
        printBestStudent(studentsData);

        printAllStudents(studentsData);
    }

    private static void printBestStudent(Map<String, Map<String, Integer>> studentsData) {
        String currentName = "";
        int totalBestScore = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : studentsData.entrySet()) {

            int currentSumScore = 0;
            for (Map.Entry<String, Integer> integerEntry : entry.getValue().entrySet()) {
                currentSumScore += integerEntry.getValue();

            }
            if (currentSumScore > totalBestScore) {
                totalBestScore = currentSumScore;
                currentName = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", currentName, totalBestScore);
    }

    private static void printAllStudents(Map<String, Map<String, Integer>> studentsData) {
        System.out.println("Ranking: ");
        for (Map.Entry<String, Map<String, Integer>> entry : studentsData.entrySet()) {
            System.out.println(entry.getKey());

            Map<String, Integer> sortedMap = new LinkedHashMap<>();

            entry.getValue().entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));

            for (Map.Entry<String, Integer> item : sortedMap.entrySet()) {
                System.out.printf("#  %s -> %d%n", item.getKey(), item.getValue());
            }
        }
    }
}

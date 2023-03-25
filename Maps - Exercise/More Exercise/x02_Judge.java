package Maps_Lambda_StreamAPI_MoreEx;

import java.util.*;

public class x02_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> totalScore = new TreeMap<>();
        Map<String, Map<String, Integer>> contestData = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("no more time")) {
            String userName = inputLine.split(" -> ")[0];
            String contestName = inputLine.split(" -> ")[1];
            int points = Integer.parseInt(inputLine.split(" -> ")[2]);

            if (!contestData.containsKey(contestName)) {
                contestData.put(contestName, new TreeMap<>());
                contestData.get(contestName).put(userName, points);
            } else {
                if (contestData.get(contestName).containsKey(userName)) {
                    int availabilityPoints = contestData.get(contestName).get(userName);

                    if (points > availabilityPoints) {
                        contestData.get(contestName).put(userName, points);
                    }
                } else {
                    contestData.get(contestName).put(userName, points);
                }
            }


            inputLine = scanner.nextLine();
        }
        contestData.entrySet().stream().forEach(entry -> {
            entry.getValue().entrySet().forEach(e ->{
                totalScore.putIfAbsent(e.getKey(),0);
                totalScore.put(e.getKey(),totalScore.get(e.getKey()) + e.getValue());
            });
        });

        printContestData(contestData);
        printIndividualParticipantStatistics(totalScore);

    }

    private static void printContestData(Map<String, Map<String, Integer>> contestData) {
        for (Map.Entry<String, Map<String, Integer>> entry : contestData.entrySet()) {
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());

            Map<String, Integer> contestDateSorted = new LinkedHashMap<>();

            entry.getValue().entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(e -> contestDateSorted.put(e.getKey(), e.getValue()));

            int counter = 1;
            for (Map.Entry<String, Integer> eachUserPoints : contestDateSorted.entrySet()) {

                System.out.printf("%d. %s <::> %d%n", counter, eachUserPoints.getKey(), eachUserPoints.getValue());
                counter++;
            }
        }
    }

    private static void printIndividualParticipantStatistics(Map<String, Integer> totalScore) {
        System.out.println("Individual standings:");

        Map<String, Integer> totalScoreSorted = new LinkedHashMap<>();
        totalScore.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> totalScoreSorted.put(e.getKey(), e.getValue()));
        final int[] counter = {1};
        totalScoreSorted.entrySet().forEach(e -> {
            System.out.printf("%d. %s -> %d%n", counter[0], e.getKey(), e.getValue());
            counter[0]++;
        });
    }
}

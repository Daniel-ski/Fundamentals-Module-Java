package RegularExpressions_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class x02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String racersName = scanner.nextLine();
        Map<String,Integer> racersData = new LinkedHashMap<>();
        Arrays.stream(racersName.split(", ")).forEach(e -> racersData.put(e,0));

        String inputLine = scanner.nextLine();

        Pattern patternForName = Pattern.compile("[A-Za-z]+");
        Pattern patternForDistance = Pattern.compile("[\\d]");

        while (!inputLine.equals("end of race")){

            Matcher matcherForName = patternForName.matcher(inputLine);
            Matcher matcherForDistance = patternForDistance.matcher(inputLine);

            StringBuilder currentRacerName = new StringBuilder();
            int currentRacerDistance = 0;

            while (matcherForName.find()) {
                currentRacerName.append(matcherForName.group());
            }
            while (matcherForDistance.find()) {
                currentRacerDistance += Integer.parseInt(matcherForDistance.group());
            }
            if (racersData.containsKey(currentRacerName.toString())){
                racersData.put(currentRacerName.toString(),racersData.get(currentRacerName.toString()) + currentRacerDistance);
            }

            inputLine = scanner.nextLine();

        }
        int placeCount = 1;
        for (Map.Entry<String, Integer> entry : racersData.entrySet()) {
            if (placeCount == 1){
                System.out.printf("%dst place: %s%n",placeCount,entry.getKey());
            } else if (placeCount == 2) {
                System.out.printf("%dnd place: %s%n",placeCount,entry.getKey());
            } else if (placeCount == 3) {
                System.out.printf("%drd place: %s%n",placeCount,entry.getKey());
                break;
            }
            placeCount ++;
        }


//        int placeCount = 1;
//       List<String> top3Racers = racersData.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//               .limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());
//            for (String racer : top3Racers){
//                System.out.printf("%dst place: %s%n",placeCount,racer);
//
//            if (placeCount == 3){
//                break;
//            }
//            placeCount++;
//        }


    }
}

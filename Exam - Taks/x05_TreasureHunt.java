package Mid_Exam_Preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x05_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasure = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")){
            String[] commandArr = command.split("\\s+");
            String inputCommand = commandArr[0];

            switch (inputCommand){
                case "Loot":
                    for (int i = 1; i < commandArr.length ; i++) {

                        if (!treasure.contains(commandArr[i])) {
                            treasure.add(0, commandArr[i]);
                        }
                    }
                    break;
                case "Drop":
                    int indexForElement =Integer.parseInt(commandArr[1]);


                    if (treasure.size() >= indexForElement && indexForElement >=0){
                        String itemToMove = treasure.get(indexForElement);
                        treasure.remove(itemToMove);
                        treasure.add(itemToMove);
                    }
                    break;
                case "Steal":
                    int countElementToRemove = Integer.parseInt(commandArr[1]);
                    List<String> removeElements = new ArrayList<>();
                    if (treasure.size() > countElementToRemove){
                        for (int i = 1; i <= countElementToRemove ; i++) {
                            removeElements.add(0,treasure.get(treasure.size()-1));
                            treasure.remove(treasure.size()-1);

                        }
                    }else {

                        for (int i = 0; i <= treasure.size() ; i++) {
                            removeElements.add(0,treasure.get(0));
                            treasure.remove(0);
                            i = 0;
                        }
                    }
                    System.out.println(String.join(", ",removeElements));

                    break;
            }
            command = scanner.nextLine();
        }
        if (treasure.size() > 0) {
            int sumOfLength = 0;

            for (int i = 0; i < treasure.size(); i++) {
                String currentElement = treasure.get(i);
                sumOfLength += currentElement.length();
            }
            double averageProfit = sumOfLength*1.0 / treasure.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",averageProfit);
        }else {
            System.out.println("Failed treasure hunt.");
        }
    }
}

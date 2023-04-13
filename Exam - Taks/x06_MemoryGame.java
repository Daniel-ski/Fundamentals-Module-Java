package Mid_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x06_MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sequenceOfElement = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String inputCommand = scanner.nextLine();

        boolean trackingToWin = false;
        int movieCount = 0;

        while (!inputCommand.equals("end")){
            int[] inputNums = Arrays.stream(inputCommand.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int inputIndex1 = Math.min(inputNums[0],inputNums[1]);
            int inputIndex2 = Math.max(inputNums[0],inputNums[1]);

            movieCount ++;

            if (inputIndex1 == inputIndex2 || (inputIndex1 >= sequenceOfElement.size() || inputIndex1 < 0)
                    || (inputIndex2 >= sequenceOfElement.size() || inputIndex2 < 0)){
                int middleSizeList = sequenceOfElement.size() / 2;
                String elementToAdd = "-"+movieCount+"a";

                sequenceOfElement.add(middleSizeList,elementToAdd);
                sequenceOfElement.add(middleSizeList+1,elementToAdd);

                System.out.println("Invalid input! Adding additional elements to the board");
            }else if(sequenceOfElement.get(inputIndex1).equals(sequenceOfElement.get(inputIndex2))){
                String removeElement = sequenceOfElement.get(inputIndex1);

                sequenceOfElement.remove(inputIndex2);
                sequenceOfElement.remove(inputIndex1);


                System.out.printf("Congrats! You have found matching elements - %s!%n",removeElement);
            } else {
                System.out.println("Try again!");
            }
            if (sequenceOfElement.size() == 0){
                trackingToWin = true;
                break;
            }


            inputCommand = scanner.nextLine();
        }

        if (trackingToWin){
            System.out.printf("You have won in %d turns!",movieCount);
        }else {
            System.out.printf("Sorry you lose :(%n");
            System.out.println(String.join(" ",sequenceOfElement));
        }

    }
}
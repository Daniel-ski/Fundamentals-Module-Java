package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class x09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("swap")){
                int indexOne = Integer.parseInt(command.split(" ") [1]);
                int indexTwo = Integer.parseInt((command.split(" "))[2]);

               int currentIndex = numbersArr[indexOne];
                numbersArr[indexOne] = numbersArr[indexTwo];
                numbersArr[indexTwo] = currentIndex;

            } else if (command.contains("multiply")) {
                int indexOne = Integer.parseInt(command.split(" ") [1]);
                int indexTwo = Integer.parseInt((command.split(" "))[2]);

              int multiplyResult = numbersArr[indexOne] * numbersArr[indexTwo];
              numbersArr[indexOne] = multiplyResult;

            } else if (command.equals("decrease")) {
                for (int i = 0; i < numbersArr.length ; i++) {
                    numbersArr[i] --;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbersArr.length; i++) {

            if (i != numbersArr.length-1) {
                System.out.print(numbersArr[i] + ", ");
            } else {
                System.out.print(numbersArr[i]);
            }
        }
    }
}

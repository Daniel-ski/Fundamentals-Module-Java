package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class x08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < inputNumsArr.length ; index++) {
            int currentNum = inputNumsArr[index];

            for (int i = 1 + index; i < inputNumsArr.length  ; i++) {
                int nextNum = inputNumsArr[i];

                if (currentNum + nextNum == inputNum){
                    System.out.println(currentNum + " " + nextNum);
                    break;
                }
            }
        }
    }
}

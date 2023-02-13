package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class x05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean flag = false;

        for (int index = 0; index < numbersArr.length; index++) {
            int currentNum = numbersArr[index];
            if (index == numbersArr.length-1){
                System.out.print(currentNum + " ");
                break;
            }
            for (int j = index + 1; j < numbersArr.length; j++) {
                int nextNumber = numbersArr[j];
                if (currentNum > nextNumber) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(currentNum + " ");;
            }
        }

        }
    }


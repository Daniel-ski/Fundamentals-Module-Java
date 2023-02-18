package Methods_Exercise;

import java.util.Scanner;

public class x01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumsArr = new int[3];

        for (int input = 0; input < 3 ; input++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            inputNumsArr[input] = currentNum;
        }

        System.out.println(smallestNumber(inputNumsArr[0],inputNumsArr[1],inputNumsArr[2]));
    }
    public static int smallestNumber(int numberOne, int numberTwo , int numberThree){
        int smallestNum;

        if (numberOne < numberTwo && numberOne < numberThree){
            smallestNum = numberOne;
        } else if (numberTwo < numberThree) {
            smallestNum = numberTwo;
        }else {
            smallestNum = numberThree;
        }
        return smallestNum;
    }
}

package Methods_Exercise;

import java.util.Scanner;

public class x05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumsArr = new int[3];

        for (int i = 0; i < inputNumsArr.length; i++) {
            inputNumsArr[i] = Integer.parseInt(scanner.nextLine());
        }

        int result = subtract(sum(inputNumsArr[0],inputNumsArr[1]),inputNumsArr[2]);

        System.out.println(result);

    }
    public static int sum(int numOne,int numTwo){
        return numOne + numTwo;
    }

    public static int subtract(int numOne,int numThree){
        return numOne - numThree;
    }
}

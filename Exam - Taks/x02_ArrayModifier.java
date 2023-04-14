package Mid_Exam_Preparation;

import java.util.Arrays;
import java.util.Scanner;

public class x02_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumsArr = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        String inputCommand = scanner.nextLine();

        while (!inputCommand.contains("end")){
            String[] inputCommandArr = inputCommand.split("\\s");
            if (inputCommand.contains("swap")){
                swapMethod(inputCommandArr,inputNumsArr);
            } else if (inputCommand.contains("multiply")) {
                multiplyMethod(inputCommandArr,inputNumsArr);
            } else if (inputCommand.contains("decrease")) {
                decreaseMethod(inputNumsArr);
            }
            inputCommand = scanner.nextLine();
        }
        printArr(inputNumsArr);
       }

    public static int[] swapMethod(String[] inputArr , int[] numsArr ){
        int index1 =Integer.parseInt(inputArr[1]);
        int index2 =Integer.parseInt(inputArr[2]);
        int saveNumIndex1 = numsArr[index1];
        
        numsArr[index1] = numsArr[index2];
        numsArr[index2] = saveNumIndex1;
        return numsArr;
    }

    public  static  int[] multiplyMethod(String[] inputArr , int[] numsArr ){
        int index1 =Integer.parseInt(inputArr[1]);
        int index2 =Integer.parseInt(inputArr[2]);

        numsArr[index1] = numsArr[index1] * numsArr[index2];
        return numsArr;
    }

    public static int[] decreaseMethod(int[] numsArr){
        for (int i = 0; i < numsArr.length ; i++) {
            numsArr[i] --;
        }
        return numsArr;
    }

    public static void printArr (int[] numsArr) {
        for (int i = 0; i < numsArr.length; i++) {

            if (i != numsArr.length - 1) {
                System.out.print(numsArr[i] + ", ");
            } else {
                System.out.print(numsArr[i]);
            }
        }
    }
}

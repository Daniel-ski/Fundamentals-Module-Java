package Arrays_Exercise;

import java.util.Scanner;

public class x04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");

        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotations ; rotation++) {
            String firstElement = inputArr[0];
            for (int index = 0; index < inputArr.length - 1 ; index++) {
                inputArr[index] = inputArr[index + 1];
            }
            inputArr[inputArr.length - 1] = firstElement;
        }
        System.out.println(String.join(" ",inputArr));
    }
}

package Methods_Exercise;

import java.util.Scanner;

public class x07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        inputMatrix(input);
    }
    public static void inputMatrix (int number){
        for (int row = 1; row <= number ; row++) {
            for (int column = 1; column <= number ; column++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

package DataTypeAndVariables_Ex;

import java.util.Scanner;

public class x04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int symbolCount = Integer.parseInt(scanner.nextLine());

        int sumCode = 0;

        for (int i = 1; i <= symbolCount ; i++) {
            char currentSymbol = scanner.nextLine().charAt(0);

            sumCode += (int) currentSymbol;

        }
        System.out.printf("The sum equals: %d", sumCode);

    }
}

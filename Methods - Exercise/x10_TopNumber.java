package Methods_Exercise;

import java.util.Scanner;

public class x10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 1; currentNum <= inputNum; currentNum++) {

            if (isSumOfDigitDivisibleBy8(currentNum) && isContainsOddDigit(currentNum)){
                System.out.println(currentNum);
            }
        }
    }

    public static boolean isSumOfDigitDivisibleBy8(int number) {

        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;

            number = number / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean isContainsOddDigit(int number) {

        while (number != 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}

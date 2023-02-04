package DataTypeAndVariables_Ex;

import java.util.Scanner;

public class x02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int sumDigit = 0;

       while (inputNum != 0){
           int currentDigit = inputNum % 10;
           inputNum = inputNum / 10;
            sumDigit += currentDigit;


        }
        System.out.println(sumDigit);
    }
}

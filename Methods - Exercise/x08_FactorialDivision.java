package Methods_Exercise;

import java.util.Scanner;

public class x08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = calculateFactorial(firstNum)*1.0 / calculateFactorial(secondNum);

        System.out.printf("%.2f",result);
    }
    public static long calculateFactorial(int number){
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}

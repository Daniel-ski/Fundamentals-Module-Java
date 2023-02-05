package DataTypeAndVariables_Ex;

import java.util.Scanner;

public class x09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int amountExtract = 0;
        int daysCount = 0;

        while (startingYield >= 100){
            daysCount ++;
            amountExtract += startingYield;

            if (amountExtract >= 26) {
               amountExtract -= 26;
            }
            startingYield -= 10;
        }
        if (amountExtract >= 26) {
            amountExtract -= 26;
        }

        System.out.println(daysCount);
        System.out.println(amountExtract);


    }
}

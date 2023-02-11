package Arrays_Exercise;

import java.util.Scanner;

public class x01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonsCount = Integer.parseInt(scanner.nextLine());

        int[] wagonsCountArr = new int[wagonsCount];

        int sumPeoples = 0;

        for (int i = 0; i < wagonsCount ; i++) {
            int peoplesCount = Integer.parseInt(scanner.nextLine());

            wagonsCountArr[i] = peoplesCount;
        }
        for (int item : wagonsCountArr) {
            sumPeoples += item;
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println(sumPeoples);
    }
}

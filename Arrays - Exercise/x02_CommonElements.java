package Arrays_Exercise;

import java.util.Scanner;

public class x02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String[] firstInputArr = firstInput.split(" ");
        String[] secondInputArr = secondInput.split(" ");

        for (int i = 0; i < secondInputArr.length; i++) {
            for (int j = 0; j < firstInputArr.length; j++) {

                if (secondInputArr[i].equals(firstInputArr[j])) {
                    System.out.print(secondInputArr[i] + " ");
                }
            }
        }
        // Вариянт с foreach цикъл и string.format принтиране :
//        for (String elementSecondArr : secondInputArr) {
//            for (String elementFirstArr : firstInputArr) {
//                if (elementSecondArr.equals(elementFirstArr)) {
//                    System.out.print(elementFirstArr + " ");
//                }
//
//            }
//        }
    }
}

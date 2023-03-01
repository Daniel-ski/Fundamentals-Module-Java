package Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class x09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){

            printPalindromeNumbers(input);

            input = scanner.nextLine();
        }
    }

    public static void printPalindromeNumbers(String number){
        int[] currentNum = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
        int[] reversCurrentNum = new int[currentNum.length];

        boolean isTheSame = false;

        for (int i = 0; i <currentNum.length ; i++) {
            reversCurrentNum[currentNum.length-1-i] = currentNum[i];
        }

        for (int i = 0; i < currentNum.length ; i++) {
            if (reversCurrentNum[i] == currentNum[i]){
                isTheSame = true;
        }else {
                isTheSame = false;
                break;
            }
        }
        System.out.println(isTheSame);
    }

//    Scanner scanner = new Scanner(System.in);
//    String number = scanner.nextLine();
//
//        while (!number.equals("END")) {
//        if(!isPalindrom(number)) {
//            System.out.println(isPalindrom(number));
//        } else {
//            System.out.println(isPalindrom(number));
//        }
//        number = scanner.nextLine();
//    }
//}
//
//    private static boolean isPalindrom(String number) {
//        String reversedString = "";
//        for (int i = number.length() - 1; i >= 0 ; i--) {
//            reversedString += number.charAt(i);
//        }
//        return number.equals(reversedString);
//    }
}


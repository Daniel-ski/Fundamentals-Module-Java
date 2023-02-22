package Methods_Exercise;

import java.util.Scanner;

public class x03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);

        printCharacters(one,two);
    }

    public static void printCharacters(char one , char two){
        if (one > two){
            for (int i = two + 1; i < one ; i++) {
                System.out.print((char)i + " ");
            }
        }else {
            for (int i = one + 1; i < two; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}

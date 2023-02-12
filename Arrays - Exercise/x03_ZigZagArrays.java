package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class x03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = Integer.parseInt(scanner.nextLine());

        int[] Numbers1 = new int[lineCount];
        int[] Numbers2 = new int[lineCount];

        for (int i = 1; i <= lineCount ; i++) {
            int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0){
                Numbers1[i-1] = input[1];
                Numbers2[i-1] = input[0];
            }else {
                Numbers1[i-1] = input[0];
                Numbers2[i-1] = input[1];
            }

        }
        for (int item : Numbers1) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int item : Numbers2) {
            System.out.print(item + " ");
        }

    }
}

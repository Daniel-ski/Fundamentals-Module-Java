package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        inputNumsList.removeIf(e -> e < 0);
        Collections.reverse(inputNumsList);

        if (inputNumsList.size() == 0){
            System.out.println("empty");
        }else {
            System.out.print(inputNumsList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

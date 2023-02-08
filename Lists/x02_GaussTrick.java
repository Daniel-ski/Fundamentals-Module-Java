package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            int listSize = inputNumsList.size();
        for (int i = 0; i < listSize / 2 ; i++) {
            inputNumsList.set(i, inputNumsList.get(i) + inputNumsList.get(inputNumsList.size()-1));
            inputNumsList.remove(inputNumsList.size()-1);
        }
        for (int item : inputNumsList){
            System.out.print(item + " ");
        }
    }
}

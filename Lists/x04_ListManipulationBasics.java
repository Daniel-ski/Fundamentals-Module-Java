package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandArr = command.split(" ");
            int num = Integer.parseInt(commandArr[1]);

            if (commandArr[0].equals("Add")){
                inputNumsList.add(num);
            } else if (commandArr[0].equals("Remove")) {
                inputNumsList.remove(Integer.valueOf(num));
            } else if (commandArr[0].equals("RemoveAt")) {
                inputNumsList.remove(num);
            } else if (commandArr[0].equals("Insert")) {
                int index = Integer.parseInt(commandArr[2]);
                inputNumsList.add(index,num);
            }

            command = scanner.nextLine();
        }
        System.out.print(inputNumsList.toString().replaceAll("[\\[\\],]",""));
    }
}

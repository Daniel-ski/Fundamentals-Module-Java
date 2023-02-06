package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandArr = command.split(" ");

            switch (commandArr[0]){
                case "Delete":
                    inputNumsList.removeIf(e -> e == Integer.parseInt(commandArr[1]));
                    break;
                case "Insert":
                    inputNumsList.add(Integer.parseInt(commandArr[2]),Integer.parseInt(commandArr[1]));
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(inputNumsList.toString().replaceAll("[\\[\\],]",""));
    }
}

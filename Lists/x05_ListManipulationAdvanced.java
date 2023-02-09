package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");

            switch (commandArr[0]) {
                case "Contains":
                    if (inputNumsList.contains(Integer.valueOf(commandArr[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandArr[1].equals("even")) {
                        for (int i = 0; i < inputNumsList.size(); i++) {
                            if (inputNumsList.get(i) % 2 == 0) {
                                System.out.print(inputNumsList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandArr[1].equals("odd")) {
                        for (int item : inputNumsList) {
                            if (item % 2 != 0) {
                                System.out.print(item + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int item : inputNumsList) {
                        sum += item;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":

                    for (int element : conditionalMethod(inputNumsList, commandArr[1], Integer.parseInt(commandArr[2]))) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
    public static List<Integer> conditionalMethod (List<Integer> list , String condition , int element){
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {

            switch (condition) {
                case "<":
                if (list.get(i) < element){
                    resultList.add(list.get(i));
                }
                    break;
                case ">":
                    if (list.get(i) > element){
                        resultList.add(list.get(i));
                    }
                    break;
                case ">=":
                    if (list.get(i) >= element){
                        resultList.add(list.get(i));
                    }
                    break;
                case "<=":
                    if (list.get(i) <= element){
                        resultList.add(list.get(i));
                    }
                    break;
            }
        }
        return resultList;
    }
}

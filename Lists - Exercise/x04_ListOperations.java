package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] commandArr = command.split(" ");

            switch (commandArr[0]){
                case "Add":
                    inputNumsList.add(Integer.parseInt(commandArr[1]));
                    break;
                case "Insert":
                    int element = Integer.parseInt(commandArr[1]);
                    int index = Integer.parseInt(commandArr[2]);
                    if (index > inputNumsList.size()-1 || index < 0){
                        System.out.println("Invalid index");
                        break;
                    }
                    inputNumsList.add(index,element);
                    break;
                case "Remove":
                    if (Integer.parseInt(commandArr[1]) > inputNumsList.size()-1 || Integer.parseInt(commandArr[1]) < 0){
                        System.out.println("Invalid index");
                        break;
                    }
                    inputNumsList.remove(Integer.parseInt(commandArr[1]));
                    break;
                case "Shift":
                    int shiftCount = Integer.parseInt(commandArr[2]);
                    if (commandArr[1].equals("left")){
                        for (int i = 1; i <= shiftCount ; i++) {
                            inputNumsList.add(inputNumsList.get(0));
                            inputNumsList.remove(0);
                        }
                        
                    } else if (commandArr[1].equals("right")) {
                        for (int i = 1; i <= shiftCount ; i++) {
                            inputNumsList.add(0,inputNumsList.get(inputNumsList.size()-1));
                            inputNumsList.remove(inputNumsList.size()-1);
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int element : inputNumsList){
            System.out.print(element + " ");
        }
    }
}

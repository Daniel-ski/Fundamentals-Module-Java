package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsCount = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] currentCommand = command.split("\\s+");

            if (currentCommand[0].equals("Add")){
                wagonsCount.add(Integer.parseInt(currentCommand[1]));
            }else {
                int currentCountPassengers = Integer.parseInt(currentCommand[0]);

                for (int i = 0; i < wagonsCount.size() ; i++) {
                    if (currentCountPassengers + wagonsCount.get(i) <= maxCapacity ){
                        wagonsCount.set(i,currentCountPassengers + wagonsCount.get(i));
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (int element : wagonsCount){
            System.out.print(element + " ");
        }
    }
}

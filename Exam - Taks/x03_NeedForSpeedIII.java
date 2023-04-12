package Final_Exam_Peparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class x03_NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Map <Integer,Integer>> carsData = new LinkedHashMap<>();

        for (int i = 0; i <= n ; i++) {
            String inputData = scanner.nextLine();

            String carModel = inputData.split("\\|")[0];
            int carMileage = Integer.parseInt(inputData.split("\\|")[1]);
            int carFuel = Integer.parseInt(inputData.split("\\|")[2]);

            carsData.put(carModel,new LinkedHashMap<>());
            carsData.get(carModel).put(carMileage,carFuel);

        }

        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("Stop")){
            String carModel = inputCommand.split("\\|")[1];
            int carMileage = Integer.parseInt(inputCommand.split("\\|")[2]);
            int carFuel = Integer.parseInt(inputCommand.split("\\|")[3]);


            if (inputCommand.split(" : ")[0].contains("Drive")){
          //  if (carsData.get(carModel).get())
            } else if (inputCommand.split(" : ")[0].contains("Refuel")) {

            } else if (inputCommand.split(" : ")[0].contains("Revert")) {

            }

            inputCommand = scanner.nextLine();
        }
    }
}

package x05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> truckList = new ArrayList<>();
        List<Vehicle> carList = new ArrayList<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")) {
            String[] vehicleData = inputLine.split("\\s+");

            String typeOfVehicle = vehicleData[0];
            String modelOfVehicle = vehicleData[1];
            String colorOfVehicle = vehicleData[2];
            int horsePowerOfVehicle = Integer.parseInt(vehicleData[3]);

            if (typeOfVehicle.equals("car")) {
                Vehicle currentCar = new Vehicle(typeOfVehicle, modelOfVehicle, colorOfVehicle, horsePowerOfVehicle);
                carList.add(currentCar);
            } else if (typeOfVehicle.equals("truck")) {
                Vehicle currentTruck = new Vehicle(typeOfVehicle, modelOfVehicle, colorOfVehicle, horsePowerOfVehicle);
                truckList.add(currentTruck);
            }

            inputLine = scanner.nextLine();
        }

        String inputModelOfVehicle = scanner.nextLine();
        while (!inputModelOfVehicle.equals("Close the Catalogue")) {
            for (Vehicle car : carList) {
                if (car.getModel().equals(inputModelOfVehicle)) {
                    System.out.println(car);
                }
            }
            for (Vehicle truck : truckList) {
                if (truck.getModel().equals(inputModelOfVehicle)) {
                    System.out.println(truck);
                }
            }
            inputModelOfVehicle = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePower(carList));
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePower(truckList));
    }

    public static double averageHorsePower(List<Vehicle> list) {
        int sumOfHorsePower = 0;
        int countVehicle = 0;
        for (Vehicle item : list) {
            countVehicle++;
            sumOfHorsePower += item.getHorsePower();
        }
        if (countVehicle > 0) {
            double averageHorsePower = sumOfHorsePower * 1.0 / countVehicle;
            return averageHorsePower;
        }else {
            return sumOfHorsePower;
        }
    }
}

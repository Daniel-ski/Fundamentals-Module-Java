package DataTypeAndVariables_Ex;

import java.util.Scanner;

public class x08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxVolume = Double.MIN_VALUE ;
        String maxModelKeg = "";

        int countKegs = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countKegs ; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height;

            if (volume > maxVolume){
                maxVolume = volume;
                maxModelKeg = kegModel;
            }

        }

        System.out.println(maxModelKeg);


    }
}

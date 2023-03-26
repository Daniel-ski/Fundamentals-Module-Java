package RegularExpressions_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class x01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furnitureNames = new ArrayList<>();

        double totalPrice = 0;

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Purchase")){

            Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)");
            Matcher matcher = pattern.matcher(inputLine);

            if (matcher.find()){

                furnitureNames.add(matcher.group("name"));
                totalPrice += Double.parseDouble(matcher.group("price")) * Double.parseDouble( matcher.group("quantity"));
            }

            inputLine = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String name : furnitureNames){
            System.out.println(name);
        }
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}

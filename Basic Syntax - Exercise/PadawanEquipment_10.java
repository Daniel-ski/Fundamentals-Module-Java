package BasicSyntax_Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double priceLightSabers = priceLightSaber * Math.ceil(countStudents + 0.10 * countStudents) ;
        double priceRobes = priceRobe * countStudents;
        double priceBelts = priceBelt * (countStudents - countStudents / 6) ;


        double allPrice = priceLightSabers + priceRobes + priceBelts;

        if (allPrice <= amountMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",allPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",allPrice - amountMoney);
        }

    }
}

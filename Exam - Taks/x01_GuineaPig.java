package Mid_Exam_Preparation;

import java.util.Scanner;

public class x01_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantityToGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayQuantityToGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverQuantityToGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double guineaWeightToGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        boolean flag = false;

        for (int days = 1; days <= 30 ; days++) {
            foodQuantityToGrams -= 300;

            if (days % 2 == 0){
                hayQuantityToGrams -= amountHay(foodQuantityToGrams);
            }
            if (days % 3 == 0){
                coverQuantityToGrams -= amountCover(guineaWeightToGrams);
            }

            if (foodQuantityToGrams <= 0 || hayQuantityToGrams <= 0 || coverQuantityToGrams <= 0 ){
                System.out.println("Merry must go to the pet store!");
                flag = true;
                break;
            }

        }
        if (!flag) {
            coverQuantityToGrams = coverQuantityToGrams / 1000;
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodQuantityToGrams / 1000, hayQuantityToGrams / 1000, coverQuantityToGrams);
        }
    }

    public static double amountHay (double currentQuantityFood){
        return currentQuantityFood * 0.05;
    }
    public static double amountCover (double guineaWeight ){
        return guineaWeight / 3;
    }
}

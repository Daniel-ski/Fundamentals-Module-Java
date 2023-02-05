package DataTypeAndVariables_Ex;

import java.util.Scanner;

public class x10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int  currentPower = power;
        int pokeCount = 0;

        while (currentPower >= distance){
            currentPower -= distance;
                pokeCount ++;
            if (currentPower == power / 2 && factor != 0){
                currentPower /= factor;
            }

        }

        System.out.println(currentPower);
        System.out.println(pokeCount);
    }
}

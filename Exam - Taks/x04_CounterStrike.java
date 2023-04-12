package Mid_Exam_Preparation;

import java.util.Scanner;

public class x04_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int countWonBattles = 0;
        boolean loss = false;
        String command = scanner.nextLine();

        while (!command.equals("End of battle")){
            int distance = Integer.parseInt(command);

            if (energy < distance){
                loss = true;
                break;
            }else {
                energy -= distance;
                countWonBattles++;

                if (countWonBattles % 3 == 0){
                    energy += countWonBattles;
                }
            }

            command = scanner.nextLine();
        }
        if (loss){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",countWonBattles,energy);
        }else{
            System.out.printf("Won battles: %d. Energy left: %d",countWonBattles,energy);
        }
    }
}

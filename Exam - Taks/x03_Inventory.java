package Mid_Exam_Preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputCollect = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("Craft!")){
            String[] inputCommandArr = inputCommand.split(" - ");
            String currentItem = inputCommandArr[1];

            if ("Collect".contains(inputCommandArr[0])) {
                if (!inputCollect.contains(currentItem)) {
                    inputCollect.add(currentItem);
                }
            } else if ("Drop".contains(inputCommandArr[0])) {
                inputCollect.removeIf(e -> e.equals(currentItem));
            } else if ("Combine Items".contains(inputCommandArr[0])) {
                String[] oldAndNewItem = inputCommandArr[1].split(":");

                if (inputCollect.contains(oldAndNewItem[0])) {
                    for (int i = 0; i < inputCollect.size(); i++) {
                        if (inputCollect.get(i).equals(oldAndNewItem[0])) {
                            inputCollect.add(i+1, oldAndNewItem[1]);
                            break;
                        }
                    }
                }
            } else if ("Renew".contains(inputCommandArr[0])) {
                if (inputCollect.contains(inputCommandArr[1])) {
                    String currentItemSave = inputCommandArr[1];
                    inputCollect.removeIf(e -> e.contains(inputCommandArr[1]));
                    inputCollect.add(currentItemSave);
                }
            }
            inputCommand = scanner.nextLine();
        }
        System.out.println(String.join(", ",inputCollect));
    }
}

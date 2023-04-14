package Mid_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            List<String> phonesListD =
                    Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
            String inputCommandD = scanner.nextLine();
            while (!inputCommandD.equals("End")) {
                String[] commandTokensD = inputCommandD.split(" - ");
                String command = commandTokensD[0];

                switch (command) {
                    case "Add":
                        String toAdd = commandTokensD[1];
                        if (!phonesListD.contains(toAdd)) {
                            phonesListD.add(toAdd);
                        }
                        break;
                    case "Remove":
                        String toRemove = commandTokensD[1];
                        if (phonesListD.contains(toRemove)) {
                            phonesListD.remove(toRemove);
                        }
                        break;
                    case "Bonus phone":
                        String[] phonesD = commandTokensD[1].split(":");
                        String oldD = phonesD[0];
                        String newD = phonesD[1];
                        if (phonesListD.contains(oldD)) {
                            int oldIndex = phonesListD.indexOf(oldD);
                            phonesListD.add((oldIndex + 1), newD);
                        }
                        break;
                    case "Last":
                        String phoneLast = commandTokensD[1];
                        if (phonesListD.contains(phoneLast)) {
                            phonesListD.remove(phoneLast);
                            phonesListD.add(phoneLast);
                        }
                        break;
                }
                inputCommandD = scanner.nextLine();
            }
            System.out.println(String.join(", ", phonesListD));

        }
    }


package Mid_Exam_Preparation.FriendList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> usernames = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> blackListed = new ArrayList<>();
        List<String> lossList = new ArrayList<>();


        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("Report")) {
            String[] command = inputCommand.split(" ");

            if (command[0].equals("Blacklist")) {
                if (usernames.contains(command[1])) {
                    int index = usernames.indexOf(command[1]);
                    blackListed.add(command[1]);
                    usernames.set(index, "Blacklisted");
                    System.out.printf("%s was blacklisted.%n", command[1]);
                } else {
                    // lossList.add(command[1]);
                    System.out.printf("%s was not found.%n", command[1]);
                }
            } else if (command[0].equals("Error")) {
                int inputIndexD = Integer.parseInt(command[1]);
                if (isValidIndexD(usernames, inputIndexD)) {
                    if (!(usernames.get(Integer.parseInt(command[1])).equals("Blacklisted")) && !(usernames.get(Integer.parseInt(command[1])).equals("Lost"))) {

                        lossList.add(usernames.get(Integer.parseInt(command[1])));
                        System.out.printf("%s was lost due to an error.%n", usernames.get(Integer.parseInt(command[1])));
                        usernames.set(Integer.parseInt(command[1]), "Lost");

                    }
                }
            } else if (command[0].equals("Change")) {
                int inputIndexD = Integer.parseInt(command[1]);
                if (isValidIndexD(usernames, inputIndexD)) {
                    String currentName = usernames.get(Integer.parseInt(command[1]));
                    usernames.set(Integer.parseInt(command[1]), command[2]);
                    System.out.printf("%s changed his username to %s.%n", currentName, command[2]);
                }

            }

            inputCommand = scanner.nextLine();
        }
      outputPrintD(blackListed,lossList,usernames);
    }

    public static boolean isValidIndexD(List<String> listD, int indexD) {
        if (indexD >= 0 && listD.size() > indexD) {
            return true;
        }
        return false;
    }
    public static void outputPrintD(List<String> blackList,List<String> lossList,List<String> usernameList){
        System.out.printf("Blacklisted names: %d%n", blackList.size());
        System.out.printf("Lost names: %d%n", lossList.size());
        for (String item : usernameList) {
            System.out.print(item + " ");
        }
    }
}



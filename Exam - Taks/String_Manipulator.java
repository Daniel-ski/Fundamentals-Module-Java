package Exam;

import java.util.Scanner;

public class String_Manipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        StringBuilder inputBuild = new StringBuilder(inputLine);
        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("End")) {
            if (inputCommand.split("\\s+")[0].contains("Translate")) {
                String character = inputCommand.split("\\s+")[1];
                String replacement = inputCommand.split("\\s+")[2];

                String currentText = inputBuild.toString();
                currentText = currentText.replace(character, replacement);
                inputBuild = new StringBuilder(currentText);
                System.out.println(inputBuild);
            } else if (inputCommand.split("\\s+")[0].contains("Includes")) {
                String subString = inputCommand.split("\\s+")[1];

                if (inputBuild.indexOf(subString) == -1) {
                    System.out.println("False");
                } else {
                    System.out.println("True");
                }

            } else if (inputCommand.split("\\s+")[0].contains("Start")) {

                String subString = inputCommand.split("\\s+")[1];
                if (inputBuild.indexOf(subString) == 0) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (inputCommand.split("\\s+")[0].contains("Lowercase")) {
                String currentText = inputBuild.toString();
                currentText = currentText.toLowerCase();
                inputBuild = new StringBuilder(currentText);
                System.out.println(inputBuild);

            } else if (inputCommand.split("\\s+")[0].contains("FindIndex")) {
                String character = inputCommand.split("\\s+")[1];

                int lastIndex = inputBuild.lastIndexOf(character);
                System.out.println(lastIndex);

            } else if (inputCommand.split("\\s+")[0].contains("Remove")) {
                int startIndex = Integer.parseInt(inputCommand.split("\\s+")[1]);
                int countToRemove = Integer.parseInt(inputCommand.split("\\s+")[2]);

//                String currentText = inputBuild.toString();
//                currentText = currentText.rep


                inputBuild.delete(startIndex,startIndex +countToRemove);


                System.out.println(inputBuild);
            }

            inputCommand = scanner.nextLine();
        }

    }
}

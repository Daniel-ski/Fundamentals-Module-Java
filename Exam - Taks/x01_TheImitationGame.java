package Final_Exam_Peparation;

import java.util.Scanner;

public class x01_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            if (command.split("\\|")[0].contains("Move")) {
                int numOfLetters = Integer.parseInt(command.split("\\|")[1]);
                String charsToMove = encryptedMessage.substring(0, numOfLetters);

                encryptedMessage.append(charsToMove);
                encryptedMessage.delete(0, numOfLetters);

            } else if (command.split("\\|")[0].contains("Insert")) {
                int index = Integer.parseInt(command.split("\\|")[1]);
                String value = command.split("\\|")[2];

                encryptedMessage.insert(index, value);

            } else if (command.split("\\|")[0].contains("Change")) {
                String stringToReplacement = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];

                String currentMessage = encryptedMessage.toString();
                currentMessage = currentMessage.replace(stringToReplacement, replacement);
                encryptedMessage = new StringBuilder(currentMessage);
            }

            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}

package Maps_Lambda_StreamAPI_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class x04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countUsers = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingRegisterMap = new LinkedHashMap<>();

        for (int user = 1; user <= countUsers; user++) {
            String[] currentUserData = scanner.nextLine().split("\\s+");

            switch (currentUserData[0]) {
                case "register":
                    if (parkingRegisterMap.containsKey(currentUserData[1])) {
                        System.out.printf("ERROR: already registered with plate number %s%n", currentUserData[2]);
                    } else {
                        parkingRegisterMap.put(currentUserData[1], currentUserData[2]);
                        System.out.printf("%s registered %s successfully%n", currentUserData[1], currentUserData[2]);
                    }
                    break;
                case "unregister":
                    if (!parkingRegisterMap.containsKey(currentUserData[1])) {
                        System.out.printf("ERROR: user %s not found%n", currentUserData[1]);
                    } else {
                        parkingRegisterMap.remove(currentUserData[1]);
                        System.out.printf("%s unregistered successfully%n", currentUserData[1]);
                    }
                    break;
            }

        }
        for (Map.Entry<String, String> entry : parkingRegisterMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}

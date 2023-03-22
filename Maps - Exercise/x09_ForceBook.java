package Maps_Lambda_StreamAPI_Ex;

import java.util.*;

public class x09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("Lumpawaroo")) {


            if (inputCommand.contains(" | ")) {

                String side = inputCommand.split("\\s+\\|\\s+")[0];
                String user = inputCommand.split("\\s+\\|\\s+")[1];
                boolean isExistUser = false;

                for (List<String> userList : forceBook.values()) {
                    if (userList.contains(user)) {
                        isExistUser = true;
                    }
                }

                if (!forceBook.containsKey(side) && !isExistUser) {
                    forceBook.put(side, new ArrayList<>());
                    forceBook.get(side).add(user);

                } else if (forceBook.containsKey(side) && !isExistUser) {
                    forceBook.get(side).add(user);
                }
            } else if (inputCommand.contains(" -> ")) {

                String side = inputCommand.split("\\s+->\\s+")[1];
                String user = inputCommand.split("\\s+->\\s+")[0];

                forceBook.entrySet().forEach(entry -> entry.getValue().remove(user));

                if (forceBook.containsKey(side)) {
                    forceBook.get(side).add(user);

                } else  {
                    forceBook.put(side, new ArrayList<>());
                    forceBook.get(side).add(user);

                }
                System.out.printf("%s joins the %s side!%n", user, side);
            }

            inputCommand = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (String users : entry.getValue()) {
                    System.out.println("! " + users);
                }
            }
        }

//        forceBook.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
//                            .forEach(entry -> {
//                                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
//                                entry.getValue().forEach(user -> System.out.println("! " + user));
//                            }
//                            );
    }
}


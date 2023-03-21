package Maps_Lambda_StreamAPI_Ex;

import java.util.*;

public class x08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyData = new LinkedHashMap<>();
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")) {
            String currentCompany = inputLine.split(" -> ")[0];
            String currentID = inputLine.split(" -> ")[1];

            companyData.putIfAbsent(currentCompany, new ArrayList<>());

            if (!companyData.get(currentCompany).contains(currentID)) {
                companyData.get(currentCompany).add(currentID);
            }

            inputLine = scanner.nextLine();
        }
        companyData.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            for (String employee : entry.getValue()) {
                System.out.printf("-- %s%n", employee);
            }
        });
    }
}

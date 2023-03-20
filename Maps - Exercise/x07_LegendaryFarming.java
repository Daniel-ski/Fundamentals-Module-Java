package Maps_Lambda_StreamAPI_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class x07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean IsObtained = false;
        Map<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        while (!IsObtained) {
            String[] inputLine = scanner.nextLine().toLowerCase().split("\\s+");

            for (int i = 0; i < inputLine.length; i += 2) {

                materialsMap.putIfAbsent(inputLine[i + 1], 0);
                materialsMap.put(inputLine[i + 1], materialsMap.get(inputLine[i + 1]) + Integer.parseInt(inputLine[i]));

                if (materialsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materialsMap.put("shards", materialsMap.get("shards") - 250);
                    IsObtained = true;
                    break;
                } else if (materialsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materialsMap.put("fragments", materialsMap.get("fragments") - 250);
                    IsObtained = true;
                    break;
                } else if (materialsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materialsMap.put("motes", materialsMap.get("motes") - 250);
                    IsObtained = true;
                    break;
                }
            }

        }

        for (Map.Entry<String, Integer> entry : materialsMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }
}


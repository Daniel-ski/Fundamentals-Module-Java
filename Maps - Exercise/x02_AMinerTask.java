package Maps_Lambda_StreamAPI_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class x02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Integer> resourceMap = new LinkedHashMap<>();
        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("stop")){
            int quantity =Integer.parseInt(scanner.nextLine());

            if (!resourceMap.containsKey(inputCommand)){
                resourceMap.put(inputCommand,quantity);
            }else {
                resourceMap.put(inputCommand,resourceMap.get(inputCommand)+quantity);
            }

            inputCommand = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}

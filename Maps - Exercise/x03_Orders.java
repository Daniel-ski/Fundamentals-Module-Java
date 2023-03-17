package Maps_Lambda_StreamAPI_Ex;

import java.util.*;

public class x03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> productDataMap = new LinkedHashMap<>();
        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("buy")){
            String productName = inputCommand.split(" ")[0];
            double productPrice = Double.parseDouble(inputCommand.split(" ")[1]);
            double productQuantity = Double.parseDouble(inputCommand.split(" ")[2]);

            if (!productDataMap.containsKey(productName)) {
                productDataMap.put(productName, new ArrayList<>());
                productDataMap.get(productName).add(productPrice);
                productDataMap.get(productName).add(productQuantity);
            }else {
                productDataMap.get(productName).set(1, productDataMap.get(productName).get(1)+productQuantity);
                if (productDataMap.get(productName).get(0) != productPrice){
                    productDataMap.get(productName).set(0,productPrice);
                }
            }

            inputCommand = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : productDataMap.entrySet()) {
                double totalPrice = 0;
                totalPrice = entry.getValue().get(0) * entry.getValue().get(1);

            System.out.printf("%s -> %.2f%n",entry.getKey(),totalPrice);
        }
    }
}

package Maps_Lambda_StreamAPI_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class x01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(" ");
        LinkedHashMap<Character,Integer> charCounterMap = new LinkedHashMap<>();

        for (String item : inputLine){
            for (int i = 0; i < item.length() ; i++) {
                char currentChar = item.charAt(i);

                charCounterMap.putIfAbsent(currentChar,0);
                charCounterMap.put(currentChar,charCounterMap.get(currentChar) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCounterMap.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}

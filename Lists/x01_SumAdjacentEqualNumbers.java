package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> inputNums = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < inputNums.size()-1; i++) {
            double currentNum = inputNums.get(i);
            double nextNum = inputNums.get(i+1);
            if (currentNum == nextNum) {

                inputNums.set(i, inputNums.get(i) + inputNums.get(i + 1));
                inputNums.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(inputNums," "));
        }
        public static String joinElementsByDelimiter (List<Double> list , String delimiter){
            DecimalFormat df = new DecimalFormat("0.#");
            String result = "";
            for (double item : list) {
                String numDf = df.format(item) + delimiter;
                result += numDf;
            }
            return result;
        }
    }


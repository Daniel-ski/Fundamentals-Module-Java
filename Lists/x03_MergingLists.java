package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstInputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondInputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int smallestListSize = Math.min(firstInputList.size(), secondInputList.size());

        for (int i = 0; i < smallestListSize ; i++) {
            resultList.add(firstInputList.get(i));
            resultList.add(secondInputList.get(i));
        }
        if (firstInputList.size() > secondInputList.size()) {
            resultList.addAll(firstInputList.subList(smallestListSize, firstInputList.size() ));
        } else if (secondInputList.size() > firstInputList.size()) {
            resultList.addAll(secondInputList.subList(smallestListSize,secondInputList.size()));
        }
        for (int item : resultList){
            System.out.print(item + " ");
        }
    }
}

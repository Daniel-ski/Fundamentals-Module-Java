package x03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class x03_OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int person = 0 ; person < n ; person++) {
            String[] personData = scanner.nextLine().split("\\s+");

            Person currentPerson = new Person(personData[0],Integer.parseInt(personData[1]));
            personList.add(currentPerson);
        }
        printPersonBigger30(personList);
    }
    public static void printPersonBigger30 (List<Person> personList ){
        for (Person item : personList){
            if (item.getAge() > 30){
                System.out.println(item.getName()+" "+"-"+" "+item.getAge());
            }
        }
    }
}

package x06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")) {
            String[] personData = inputLine.split("\\s+");

            String personName = personData[0];
            String personID = personData[1];
            int personAge = Integer.parseInt(personData[2]);

            Person person = new Person(personName, personID, personAge);
            personList.add(person);

            inputLine = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {

            String[] inputCommand = input.split(":");

            if (inputCommand[0].equals("Add")) {
                if (!schedule.contains(inputCommand[1])) {
                    schedule.add(inputCommand[1]);
                }
            } else if (inputCommand[0].equals("Insert")) {
                if (!schedule.contains(inputCommand[1])) {
                    schedule.add(Integer.parseInt(inputCommand[2]), inputCommand[1]);
                }

            } else if (inputCommand[0].equals("Remove")) {
                if (schedule.contains(inputCommand[1])) {
                    int index = schedule.indexOf(inputCommand[1]);
                    schedule.remove(inputCommand[1]);
                    if (schedule.contains(inputCommand[1] + "-Exercise")) {
                        schedule.remove(index + 1);
                    }

                }
            } else if (inputCommand[0].equals("Swap")) {
                if (schedule.contains(inputCommand[1]) && schedule.contains(inputCommand[2])) {
                    int index1 = schedule.indexOf(inputCommand[1]);
                    String element1 = schedule.get(index1);

                    int index2 = schedule.indexOf(inputCommand[2]);
                    String element2 = schedule.get(index2);


                    schedule.set(index1, element2);
                    schedule.set(index2, element1);

                    String exOne = inputCommand[1] + "-Exercise";
                    String exTwo = inputCommand[2] + "-Exercise";
                    if (schedule.contains(exOne)) {
                        schedule.remove(schedule.indexOf(exOne));
                        schedule.add(schedule.indexOf(inputCommand[1] + 1), exOne);
                    }
                    if (schedule.contains(exTwo)) {
                        schedule.remove(schedule.indexOf(exTwo));
                        schedule.add(schedule.indexOf(inputCommand[2]) + 1, exTwo);
                    }

                }
            } else if (inputCommand[0].equals("Exercise")) {
                if (!schedule.contains(inputCommand[1])) {
                    schedule.add(inputCommand[1]);
                    schedule.add(inputCommand[1] + "-Exercise");
                } else {
                    int index = schedule.indexOf(inputCommand[1]);
                    if (!schedule.get(index).contains("Exercise")) {
                        schedule.add(index + 1, schedule.get(index) + "-Exercise");
                    }
                }
            }

            input = scanner.nextLine();

        }
        printCourse(schedule);

    }
    public static  void  printCourse(List<String> course){
        for (int index = 0; index < course.size(); index++) {
            System.out.println(index+1 + "." + course.get(index));
        }
    }
}

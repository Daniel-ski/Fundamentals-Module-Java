package Maps_Lambda_StreamAPI_Ex;

import java.util.*;

public class x05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        Map<String, List<String>> courseData = new LinkedHashMap<>();

        while (!inputData.equals("end")){
            String currentCourse = inputData.split(" : ")[0];
            String currentStudent = inputData.split(" : ")[1];

           courseData.putIfAbsent(currentCourse,new ArrayList<>());
           courseData.get(currentCourse).add(currentStudent);


            inputData = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courseData.entrySet()) {
            System.out.println(entry.getKey()+": "+ entry.getValue().size());
            for (String users : entry.getValue()){
                System.out.println("-- "+users);
            }
        }
    }
}

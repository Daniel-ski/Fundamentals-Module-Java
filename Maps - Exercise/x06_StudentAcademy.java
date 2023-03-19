package Maps_Lambda_StreamAPI_Ex;

import java.util.*;

public class x06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudent = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentDataMap = new LinkedHashMap<>();

        for (int i = 1; i <= numOfStudent ; i++) {
            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            studentDataMap.putIfAbsent(studentName,new ArrayList<>());
            studentDataMap.get(studentName).add(studentGrade);
        }
        for (Map.Entry<String, List<Double>> entry : studentDataMap.entrySet()) {
            double allGrade = 0;
             for (Double grade : entry.getValue()){
                 allGrade += grade;
             }
             double averageGrade = allGrade / entry.getValue().size();
             if (averageGrade >= 4.5){
                 System.out.printf("%s -> %.2f%n",entry.getKey(),averageGrade);
             }
        }

    }
}

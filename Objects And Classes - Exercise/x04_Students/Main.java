package x04_Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        int studentCount = Integer.parseInt(scanner.nextLine());

        for (int inputLine = 1; inputLine <= studentCount ; inputLine++) {
            String currentStudent = scanner.nextLine();

            String firstName = currentStudent.split(" ")[0];
            String lastName = currentStudent.split(" ")[1];
            double grade = Double.parseDouble(currentStudent.split(" ")[2]);

            Student student = new Student(firstName,lastName,grade);
            studentList.add(student);
        }
            studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList){
            System.out.println(student);
        }
    }



}

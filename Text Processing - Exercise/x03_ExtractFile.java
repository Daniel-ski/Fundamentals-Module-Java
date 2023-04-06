package TextProcessing_Exercise;

import java.util.Scanner;

public class x03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputPath = scanner.nextLine().split("\\\\");
        String fullFileName = inputPath[inputPath.length -1];
        String extension = fullFileName.split("\\.")[1];
        String fileName = fullFileName.split("\\.")[0];

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s%n",extension);
    }
}

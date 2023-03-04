package x02_articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articleList = new ArrayList<>();
        String article = scanner.nextLine();
        String tittle = article.split(", ")[0];
        String content = article.split(", ")[1];
        String author = article.split(", ")[2];

        Article currentArticle = new Article(tittle,content,author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int line = 1; line <= n ; line++) {
            String[] inputCommand = scanner.nextLine().split(": ");

            if (inputCommand[0].contains("Edit")){
                currentArticle.edit(inputCommand[1]);
                
            } else if (inputCommand[0].contains("ChangeAuthor")) {
                currentArticle.changeAuthor(inputCommand[1]);

            } else if (inputCommand[0].contains("Rename")) {
                currentArticle.rename(inputCommand[1]);
            }
        }
        System.out.println(currentArticle);
    }
}

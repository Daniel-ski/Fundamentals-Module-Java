package x02_articles;

public class Article {
    private String tittle;
    private String content;
    private String author;

    public Article (String tittle,String content,String author){
        this.tittle = tittle;
        this.content = content;
        this.author = author;
    }
    public void edit(String content){
        this.content = content;
    }
    public void changeAuthor(String author){
        this.author = author;
    }
    public void rename(String tittle){
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return this.tittle + " - " + this.content + ": " + this.author;
    }
}

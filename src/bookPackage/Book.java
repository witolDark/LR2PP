package bookPackage;
import mainPackage.Main;

import java.awt.*;

public class Book {
    private Main.Authors author;
    public void setAuthor(Main.Authors author) {
        this.author =author;
    }
    public Main.Authors getAuthor() {
        return author;
    }
    private Main.Names name;
    public void setName(Main.Names name) {
        this.name = name;
    }
    public Main.Names getName() {
        return name;
    }
    private Main.Publishers publisher;
    public void setPublisher(Main.Publishers publisher) {
        this.publisher = publisher;
    }
    public Main.Publishers getPublisher() {
        return publisher;
    }
    private int year;
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    private int pages;
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }
    @Override
    public String toString() {
        return name + ":" + pages + "pages" + '\n' +
                author + ":" + publisher + "----" + year + '\n';
    }
    public void FindByAuthor(Main.Authors author) {
        if (this.author == author) System.out.println(this);
    }
    public void FindByPublisher(Main.Publishers publisher) {
        if (this.publisher == publisher) System.out.println(this);
    }
    public void FindByYear(int year) {
        if (this.year >= year) System.out.println(this);
    }
}

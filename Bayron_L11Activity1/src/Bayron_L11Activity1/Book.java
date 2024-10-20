package Bayron_L11Activity1;

import java.io.Serializable;

public class Book implements Serializable {
    protected String title;
    protected String author;
    protected String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-20s %-4s", title, author, year);
    }
}
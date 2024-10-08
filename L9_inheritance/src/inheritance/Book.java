package inheritance;

public class Book {
    private String title;
    private String author;
    private int yearPublic;
    private boolean rented; 

    public Book(String title, String author, int yearPublic) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
        this.rented = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-20s %-4d %s", 
                             title, 
                             author, 
                             yearPublic, 
                             (isRented() ? "" : ""));
    }
}

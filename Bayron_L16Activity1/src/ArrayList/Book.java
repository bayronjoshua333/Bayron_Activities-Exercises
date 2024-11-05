package ArrayList;

public class Book {
    String title;
    String author;
    long year;
    boolean isRented;
    String returnDate;
    String dueDate;
    double fine;

    public Book(String title, String author, long year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isRented = false;
        this.dueDate = "";
        this.returnDate = "";
        this.fine = 0.0;  // Initialize fine to 0.0 by default
    }

    public void rent(String returnDate, String dueDate, double fine) {
        this.isRented = true;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.fine = fine;  // Set the fine when the book is rented
    }

    public boolean isRented() {
        return isRented;
    }

    @Override
    public String toString() {
        if (isRented) {
            return String.format("%-30s %-20s %-4s %-10s %-10s Fine: $%.2f", title, author, year, 
                                 dueDate, returnDate, fine);
        } else {
            return String.format("%-30s %-20s %-4s", title, author, year);
        }
    }
}

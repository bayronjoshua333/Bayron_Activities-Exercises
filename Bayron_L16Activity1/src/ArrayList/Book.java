package ArrayList;

public class Book {
    String title;
    boolean isRented;
    String returnDate;

    // Constructor
    public Book(String title) {
        this.title = title;
        this.isRented = false;
        this.returnDate = "";
    }

    // Method to rent the book
    public void rent(String returnDate) {
        this.isRented = true;
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + (isRented ? " (Rented, Return Date: " + returnDate + ")" : "");
    }
}

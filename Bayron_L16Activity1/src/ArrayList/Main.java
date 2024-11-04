package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Add books to the library
        Library.addBooks(books);

        // Display all books
        System.out.println("All Books in the Library:");
        Library.displayBooks(books);

        // Rent books
        Library.rentBooks(books);

        // Display rented books
        System.out.println("\nBooks after renting:");
        Library.displayBooks(books);
    }
}

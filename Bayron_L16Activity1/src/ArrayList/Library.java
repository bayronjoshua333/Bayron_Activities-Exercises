package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    // Function to add books to the ArrayList
    public static void addBooks(ArrayList<Book> books) {
        books.add(new Book("The Catcher in the Rye"));
        books.add(new Book("To Kill a Mockingbird"));
        books.add(new Book("1984"));
        books.add(new Book("The Great Gatsby"));
        books.add(new Book("Moby Dick"));
    }

    // Function to rent books
    public static void rentBooks(ArrayList<Book> books) {
        Scanner scanner = new Scanner(System.in);

        // Rent first two books for demonstration
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter return date for book '" + books.get(i).title + "':");
            String returnDate = scanner.nextLine();
            books.get(i).rent(returnDate);
        }
    }

    // Function to display books
    public static void displayBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

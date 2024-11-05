package ArrayList;

import java.util.ArrayList;

public class Library {

    public static void addBooks(ArrayList<Book> books) {
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("The Tipping Point", "M. Gladwell", 2000));
        books.add(new Book("Guns, Germs, and Steel", "Jared Diamond", 1997));
    }

    public static void rentBooks(ArrayList<Book> books) {   
        for (Book book : books) {
            if (book.title.equals("The Lord of the Rings")) {
                book.rent("10-10-2024", "10-15-2024", 30.0);
            }
            if (book.title.equals("The Tipping Point")) {
                book.rent("10-10-2024", "10-15-2024", 15.0);
            }
        }
    }

    public static void displayBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void displayRentedBooks(ArrayList<Book> books) {
       
        for (Book book : books) {
            if (book.isRented()) {
                System.out.println(book);
            }
        }
    }
}

package Bayron_L11Activity1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
        ArrayList<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(new FictionBook("The Lord of the Rings", "J.R.R Tolkien", "1954"));
        libraryBooks.add(new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", "1997"));
        libraryBooks.add(new FictionBook("To Kill a Mockingbird", "Harper Lee", "1960"));
        libraryBooks.add(new NonFictionBook("The Tipping Point", "Malcolm Gladwell", "2000"));

        ArrayList<Book> rentedBooks = new ArrayList<>();
        rentedBooks.add(new FictionBook("The Lord of the Rings", "J.R.R Tolkien", "1954"));
        rentedBooks.add(new NonFictionBook("The Tipping Point", "Malcolm Gladwell", "2000"));

        BookRentalSystem.writeToFile(libraryBooks, rentedBooks);

        BookRentalSystem.readFromFile();
    }
}

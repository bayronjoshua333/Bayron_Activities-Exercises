package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        Library.addBooks(library);

        System.out.println("* * * * L I B R A R Y * * * *");
        Library.displayBooks(library);
        
        Library.rentBooks(library);

        System.out.println("* * * * RENTED BOOKS * * * *");
        Library.displayRentedBooks(library);
    }
}

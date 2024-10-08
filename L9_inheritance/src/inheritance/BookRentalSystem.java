package inheritance;

public class BookRentalSystem extends Book {
    private Book[] books;

    public BookRentalSystem() {
        super("", "", 0);  // Call parent constructor
        books = new Book[] {
            new FictionBook("The Lord of the Rings", "J.R.R Tolkien", 1954),
            new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
            new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
            new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997)
        };
    }

    public void DisplayBooks() {
        System.out.println("\n ------------------L I B R A R Y----------------------");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void RentedBooks() {
        // Set specific books as rented
        for (Book book : books) {
            if (book.getTitle().equals("The Lord of the Rings") || book.getTitle().equals("The Tipping Point")) {
                book.setRented(true);
            }
        }

        System.out.println("\n -----B O O K S R E N T E D, N E V E R R E A D -------");
        for (Book book : books) {
            if (book.isRented()) {
                System.out.println(book.toString());
            }
        }
    }
}

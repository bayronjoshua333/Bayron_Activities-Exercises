package Bayron_L11Activity1;

import java.io.*;
import java.util.ArrayList;

public class BookRentalSystem {

    public static void writeToFile(ArrayList<Book> libraryBooks, ArrayList<Book> rentedBooks) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("library.txt"))) {

            bw.write("------------------- L I B R A R Y -----------------------");
            bw.newLine();

            for (Book book : libraryBooks) {
                bw.write(book.toString());
                bw.newLine();
            }
            bw.newLine(); 

            bw.write("-----B O O K S  R E N T E D,  N E V E R  R E A D--------");
            bw.newLine();

            for (Book book : rentedBooks) {
                bw.write(book.toString());
                bw.newLine();
            }
            System.out.println("Books have been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("library.txt"))) {
            String line;
            System.out.println("Books read from the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

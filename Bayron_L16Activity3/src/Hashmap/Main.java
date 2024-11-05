package Hashmap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PhoneBook phonebook = new PhoneBook(5); 

        while (true) {
            System.out.println("Juswa's Phonebook \n[1] Add Contacts \n[2] Display Contacts \n[3] Search Contact \n[4] Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    phonebook.addContact(scan);
                    break;
                case 2:
                    phonebook.displayContacts();
                    break;
                case 3:
                    phonebook.searchContact(scan);
                    break;
                case 4:
                    System.out.println("Exiting Phonebook...");
                    scan.close();
                    return; 
                default:
                    System.out.println("Choice not found. Try again.");
            }
        }
    }
}

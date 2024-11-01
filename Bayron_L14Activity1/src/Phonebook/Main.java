package Phonebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList(5);
        int array_list = 5;
        for (int i = 0; i < array_list; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if ("n/a".equalsIgnoreCase(name)) {
                contactList.displayAllContacts();
                break;
            }

            Long phoneNumber = null;
            while (phoneNumber == null) {
                System.out.print("Enter phone number (digits only): ");
                String input = scanner.nextLine();
                try {
                    phoneNumber = Long.parseLong(input);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid integer up to 10-11 digits.");
                }
            }

            contactList.addContact(name, phoneNumber);

            if (i == array_list - 1) {
                contactList.displayAllContacts();
                break;
            }
        }

        System.out.print("\nEnter name to search: ");
        contactList.searchByName(scanner.nextLine());
        scanner.close();
    }
}

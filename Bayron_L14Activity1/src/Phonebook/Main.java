package Phonebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContactList contactList = new ContactList(5);
        int arrayList = 5;
        for (int i = 0; i < arrayList; i++) {
            System.out.print("Enter name (or 'n/a' to stop): ");
            String name = scanner.nextLine();

            if ("n/a".equalsIgnoreCase(name)) {
                contactList.displayAllContacts();
                break;
            }

            Long phoneNumber = null;
            while (phoneNumber == null) {
                System.out.print("Enter phone number (digits only, 10-11 digits): ");
                String input = scanner.nextLine();
                try {
                    phoneNumber = validatePhoneNumber(input);
                } catch (Contact e) {
                    System.out.println(e.getMessage());
                }
            }

            contactList.addContact(name, phoneNumber);
            
            if (i == arrayList - 1) {
                contactList.displayAllContacts();
                break;
            }
        }

        System.out.print("\nEnter name to search: ");
        contactList.searchByName(scanner.nextLine());
        scanner.close();
        	
    }
        
    public static Long validatePhoneNumber(String input) throws Contact {
        if (input.length() < 10 || input.length() > 11) {
            throw new Contact("Phone number must be 10-11 digits.");
        }
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            throw new Contact("Invalid phone number format. Only digits are allowed.");
        }
    }
}

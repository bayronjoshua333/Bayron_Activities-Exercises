package Hashmap;

import java.util.*;

public class PhoneBook {

    private Map<String, Long> contacts = new HashMap<>();
    private int maxCapacity;

    public PhoneBook(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addContact(Scanner scan) {
        if (contacts.size() >= maxCapacity) {
            System.out.println("Contact list is full.");
            return;
        }

        System.out.print("Enter name: ");
        String name = scan.nextLine();

        Long phoneNumber = null;
        while (phoneNumber == null) {
            System.out.print("Enter phone number (digits only, 10-11 digits): ");
            String input = scan.nextLine();
            phoneNumber = validatePhoneNumber(input);
        }

        contacts.put(name, phoneNumber);
        System.out.println("Contact added: " + name + " (" + phoneNumber + ")");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            int index = 1;
            for (Map.Entry<String, Long> entry : contacts.entrySet()) {
                System.out.println("[" + index + "] Name: " + entry.getKey() + ", Phone: +63" + entry.getValue());
                index++;
            }
        }
    }

    public void searchContact(Scanner scan) {
        System.out.print("Enter name to search: ");
        String name = scan.nextLine();
        if (contacts.containsKey(name)) {
            Long phoneNumber = contacts.get(name);
            System.out.println("Name: " + name + "\nPhone: +63" + phoneNumber);
        } else {
            System.out.println("No contact found with the name: " + name);
        }
    }

    private Long validatePhoneNumber(String input) {
        if (input.length() < 10 || input.length() > 11) {
            System.out.println("Phone number must be 10-11 digits.");
            return null;
        }
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid phone number format. Only digits are allowed.");
            return null;
        }
    }
}

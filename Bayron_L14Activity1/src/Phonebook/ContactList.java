package Phonebook;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<Contact> contacts = new ArrayList<>();
    private int maxCapacity;

    public ContactList(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addContact(String name, Long phoneNumber) {
        if (contacts.size() < maxCapacity) {
            contacts.add(new Contact(name, phoneNumber));
        } else {
            System.out.println("Contact list is full.");
        }
    }

    public void displayAllContacts() {
        System.out.println(contacts.isEmpty() ? "No contacts found." : "");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + contacts.get(i).getName());
        }
    }

    public void searchByName(String searchName) {
        contacts.stream()
                .filter(contact -> contact.getName().equalsIgnoreCase(searchName))
                .findFirst()
                .ifPresentOrElse(
                    contact -> {
                    	System.out.println("\nName: " + contact.getName() + 
                    			"\nNumber: +63" + contact.getPhoneNumber());
                    },
                    () -> System.out.println("No name found!")
                );
    }
}

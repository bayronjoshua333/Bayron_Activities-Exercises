package Phonebook;

public class Contact {
    private String name;
    private Long phoneNumber;

    public Contact(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name; }
    public Long getPhoneNumber() { return phoneNumber; }

}

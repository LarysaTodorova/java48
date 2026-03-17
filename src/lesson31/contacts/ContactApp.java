package lesson31.contacts;

public class ContactApp {
    public static void main(String[] args) {

ContactManager manager = new ContactManager();

        Contact contact1 = new Contact("Alex", "+49215893400");
        Contact contact2 = new Contact("Alexa", "+49215930055");
        Contact contact3 = new Contact("Lisa", "+495588997711");
        Contact contact4 = new Contact("Leon", "+4921583333");
        Contact contact5 = new Contact("Max", "+49999993400");
        Contact contact6 = new Contact("Maria", "+492122400");
        Contact contactDouble = new Contact("Maria", "+492122400");

        manager.addContact(contact1);
        manager.addContact(contact2);
        manager.addContact(contact3);
        manager.addContact(contact4);
        manager.addContact(contact5);
        manager.addContact(contact6);
        manager.addContact(contactDouble);

        System.out.println(manager.getContacts());

        System.out.println(manager.getContactByName("Leon"));
        System.out.println(manager.getContactByPhoneNumber("+49215930055"));

        System.out.println("Removed contact: " + manager.removeContact(contact1));
        System.out.println(manager.getContacts());



    }
}

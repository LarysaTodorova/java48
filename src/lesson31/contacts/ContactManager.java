package lesson31.contacts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContactManager {

    private Set<Contact> contacts = new HashSet<>();

    public boolean addContact(Contact contact) {
        if (contacts.contains(contact)) {
            return false;
        }
        else {
            return contacts.add(contact);
        }
    }
public boolean removeContact(Contact contact) {
        if (!contacts.contains(contact)) {
            return false;
        }
        else {
            return contacts.remove(contact);
        }
}

public Set<Contact>  getContacts() {
        return contacts;
}

public List<Contact> getContactByName(String name) {
        List<Contact> foundedContact = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
               foundedContact.add(contact);
            }
        }
        return foundedContact;
}

public Contact getContactByPhoneNumber(String phoneNumber){
      for (Contact contact : contacts) {
          if (contact.getNumber().equals(phoneNumber)) {
              return contact;
          }
      }
      return null;
}
}

package lesson30;

import java.util.Set;
import java.util.TreeSet;

public class PoneDemo {
    public static void main(String[] args) {

        Set<Phone> phones = new TreeSet<>();

        phones.add(new Phone("Sumsung"));
        phones.add(new Phone("Apple"));
        phones.add(new Phone("LG"));
        phones.add(new Phone("Xiaomi"));
        phones.add(new Phone("Sumsung1"));

        for (Phone phone : phones) {
            System.out.println("Phone: " + phone.getName());
        }
    }
}

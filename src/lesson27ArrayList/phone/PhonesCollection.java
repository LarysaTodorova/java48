package lesson27ArrayList.phone;

import java.util.ArrayList;

public class PhonesCollection {
    public static void main(String[] args) {
        /*

         */

        ArrayList<Phone> phonesList = new ArrayList<>();
        printList(phonesList);
        System.out.println("Size of collection = " + phonesList.size());

        phonesList.add(new Phone(01,"Apple","iPhone14",1250));
        printList(phonesList);
        System.out.println("Size of collection = " + phonesList.size());

        phonesList.add(new Phone(02,"Sumsung","Galaxy",1050));
        phonesList.add(new Phone(03,"LG","KLG",850));
        phonesList.add(new Phone(04,"Apple","iPhone15",1550.0));
        phonesList.add(new Phone(05,"Xiaomi","RedMe",800));
        printList(phonesList);
        System.out.println("Size of collection = " + phonesList.size());

        System.out.println("Delete element with index # 2 ");
        phonesList.remove(2);
        printList(phonesList);

        Integer id = 04;
        String producer = "Apple";
        String model = "iPhone15";
        Double price = 1550.0;

        Phone phoneForDelete = new Phone(id,producer,model,price);

        phonesList.remove(phoneForDelete);
        System.out.println("Phone for delete" + phoneForDelete);
        printList(phonesList);


    }

    private static void printList(ArrayList<Phone> phonesList) {
        for (Phone phone : phonesList) {
            System.out.println(phone);
        }
    }
}

package homework25.phone;

import java.util.Arrays;

public class PhoneApp {
    public static void main(String[] args) {

        PhoneRepository repository = new PhoneRepository(5);
        PhoneService service = new PhoneService(repository);

        service.addNewPhone(0, "iPhone 14", "Apple");
        service.addNewPhone(1, "Galaxy", "Sumsung");
        service.addNewPhone(2, "Lcv", "LG");
        service.addNewPhone(3, "iPhone 15", "Apple");
        service.addNewPhone(4, "OTr15", "Xeaome");

        System.out.println(Arrays.toString(service.findAll()));
        System.out.println();

        service.findByProducer("Apple");
        System.out.println(Arrays.toString(service.findAll()));
        System.out.println(service.findById(3));
    }
}

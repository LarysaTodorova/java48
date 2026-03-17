package homework25.phone;

public class PhoneRepository {
    private Phone[] phones;
    private int phoneCounter = 0;

    public PhoneRepository(int phoneSize) {
        this.phones = new Phone[phoneSize];
    }

    public boolean addPhone(Phone newPhone) {
        if (phoneCounter < phones.length) {
            phones[phoneCounter] = newPhone;
            phoneCounter++;
            return true;
        }
        return false;
    }

    public Phone findByProducer(String producer) {
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {
                if (phones[i].getProducer().equals(producer)) {
                    return phones[i];
                }
            }
        }
        return null;
    }

    public Phone findById(int id) {
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {
                if (phones[i].getId() == id) {
                    return phones[i];

                }
            }
        }
        return null;
    }

    public Phone[] findAll() {
        return phones;
    }
}

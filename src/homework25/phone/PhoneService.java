package homework25.phone;

public class PhoneService {
    private PhoneRepository repository;

    public PhoneService(PhoneRepository repository) {
        this.repository = repository;
    }

    public boolean addNewPhone(int id, String model, String producer) {
        Phone checkResult = repository.findById(id);
        if (checkResult != null) {
            return false;
        }
        Phone myPhone = new Phone(id, model, producer);
        return repository.addPhone(myPhone);
    }

    public Phone findByProducer(String producer) {
        return repository.findByProducer(producer);
    }

    public Phone findById(int id) {
        return repository.findById(id);
    }

    public Phone[] findAll() {
        return repository.findAll();
    }
}

package lesson23.hospital;

public class PatientService {

    PatientRepository repository;

    InputDataService inputDataService;

    public PatientService(PatientRepository repository, InputDataService inputDataService) {
        this.repository = repository;
        this.inputDataService = inputDataService;
    }

    public void fillData() {
        // ---заполнение данными-----
        repository.add(inputDataService.getPatientData(1));
        repository.add(inputDataService.getPatientData(2));
        repository.add(inputDataService.getPatientData(3));

    }
    public boolean replacePatient(Patient newPatient) {
        Patient foundPatientByName = repository.findByName(newPatient.getName());

        if (foundPatientByName != null) {
            repository.deleteById(foundPatientByName.getId());
            repository.add(newPatient);
            return true;
        }else {
            return false;
        }
    }
    public void printHospital() {
        repository.printPatientInfo();

    }
}


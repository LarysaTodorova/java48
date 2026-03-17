package lesson23.hospital;

public class PatientDemo {
    public static void main(String[] args) {

//---создание хранилища данных того размера, который ввел пользователь---

        InputDataService inputDataService = new InputDataService();
        int hospitalSize = inputDataService.enterHospitalSize();

        PatientRepository repository = new PatientRepository(hospitalSize);
        PatientService service = new PatientService(repository,inputDataService);

        //---- Заполнеие данными ------

        service.fillData();

        //-------вывести информацию о больнице------
        service.printHospital();

        //----создадим нового пациента-------
        Patient patient = inputDataService.createNewPatient();

        //--------заменим старого пациента новым по id , который ввел пользователь---------

        boolean replaceResult = service.replacePatient(patient);
        if (replaceResult) {
            System.out.println("Old patient is go on and new came");
        }else {
            System.out.println("We have no such patient");
        }
        //--------- вывести информацию о больнице--------
        service.printHospital();
    }
}

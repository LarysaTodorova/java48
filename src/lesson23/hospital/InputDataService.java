package lesson23.hospital;

import lesson5.superCalc.UserInput;

public class InputDataService {

    UserInput userInput = new UserInput();

    public int enterHospitalSize() {
        int hospitalSize = userInput.inputInteger("Enter a hospital size:");
        return hospitalSize;
    }
    public Patient getPatientData(int id) {
        //----заполнение данными----
        switch (id) {
            case 1:
                return new Patient(1, "Alex", "Cold");
            case 2:
                return new Patient(2, "Mary", "Cardio");
            case 3:
                return new Patient(3, "Robert", "Cough");
            default:
                return null;
        }
    }
    public Patient createNewPatient() {
        int patientId = userInput.inputInteger("Enter a number of new patient:");
        String patientName = userInput.inputText("Enter a name of new patient:");
        String patientDiagnosis = userInput.inputText("Enter a diagnosis of patient");

        Patient newPatient = new Patient(patientId,patientName,patientDiagnosis);

        return newPatient;
    }

}

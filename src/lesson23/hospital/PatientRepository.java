package lesson23.hospital;

public class PatientRepository {
   private Patient[] patients;

    public PatientRepository(int sizeOfHospital) {
        this.patients = new Patient[sizeOfHospital];
    }

    public boolean add(Patient newPatient) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null){
            patients[i] = newPatient;
            return true;
        }
    }
    return false;
}
public Patient findById(int id) {
    for (int i = 0; i < patients.length; i++) {
        if (patients[i].getId() == id) {
            return patients [i];
        }
    }
    return null;
  }

  public Patient findByName(String name) {
      for (int i = 0; i < patients.length; i++) {
          if (patients[i] != null) {
          if (patients[i].getName().equalsIgnoreCase(name)) {
              return patients [i];
          }
          }
      }
      return null;
  }
  public boolean deleteById(int id) {
      for (int i = 0; i < patients.length; i++) {
          if (patients[i].getId() == id) {
              patients[i] = null;
              return true;
          }
      }
      return false;
  }
  public void printPatientInfo() {
      for (int i = 0; i < patients.length ; i++) {
          if (patients[i] != null) {
          System.out.println("Number of patient: " + patients[i].getId());
          System.out.println("Patients name: " + patients[i].getName());
          System.out.println("Patients dianisis: " + patients[i].getDiagnosis());
          System.out.println();
      }
  }
}}

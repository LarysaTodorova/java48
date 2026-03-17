package consultation9;

public class ContractedEmployee {

   private String name;
    String personalCode;
   private String position;
   private WorkingHoursRecord[] workingHoursRecords = new WorkingHoursRecord[365];
    double totalHoursByMonth;
   private double hoursByContract;
    double salaryPerMonth;

   public ContractedEmployee(String name, String personalCode, String position, double hoursByContract, double salaryPerMount) {
      this.name = name;
      this.personalCode = personalCode;
      this.position = position;
      this.hoursByContract = hoursByContract;
      this.salaryPerMonth = salaryPerMount;
      this.totalHoursByMonth = 0;

   }
   public void addWorkingHoursRecord(WorkingHoursRecord record, int dayIndex) {
      if (dayIndex >= 0 && dayIndex < 365) {
         this.workingHoursRecords[dayIndex] = record;
         this.totalHoursByMonth += record.hoursWorked;
      }
   }


   public void displayEmployeeInfo() {
      System.out.println("Имя: " + name);
      System.out.println("Персональный код: " + personalCode);
      System.out.println("Должность: " + position);
      System.out.println("Часы по контракту: " + hoursByContract);
      System.out.println("Зарплата в месяц: " + salaryPerMonth);
      System.out.println("Всего отработано часов в этом месяце: " + totalHoursByMonth);
      System.out.println("Записи о рабочих часах:");
      for (WorkingHoursRecord record : workingHoursRecords) {
         if (record != null) {
            System.out.println(record);
         }
      }
}
}


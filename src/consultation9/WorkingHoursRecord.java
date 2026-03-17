package consultation9;

public class WorkingHoursRecord {
/*
Написать приложение для учета рабочего времени сотрудников:

1) Сотрудник  в штате компании
2) Нужно обеспечить ввод данных о сотрудниках (с возможностью подключения альтернативного источника данных)
3) Нужно корректировать рабочее время сотрудника
4) Вывод информации о сотрудниках на экран

 */

  String date;
  int hoursWorked;
    String startTime;
    String finishedTime;

   public WorkingHoursRecord(String date, int hoursWorked, String startTime, String finishedTime) {
      this.date = date;
      this.hoursWorked = hoursWorked;
      this.startTime = startTime;
      this.finishedTime = finishedTime;

   }

   @Override
   public String toString() {
      return "Дата: " + date + ", Отработанные часы: " + hoursWorked + ", Время начала: " + startTime + ", Время окончания: " + finishedTime;
   }

}

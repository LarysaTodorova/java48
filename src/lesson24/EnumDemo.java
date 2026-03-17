package lesson24;

public class EnumDemo {
    public static void main(String[] args) {

        SchoolSchedule schedule = new SchoolSchedule(DayOfWeek.SUNDAY);

        Scholar scholar = new Scholar(schedule, true);
        scholar.wakeUp();


    }
}

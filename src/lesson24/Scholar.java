package lesson24;

public class Scholar {

    private SchoolSchedule schoolSchedule;
    private boolean goToSchool;

    public Scholar(SchoolSchedule schoolSchedule, boolean goToSchool) {
        this.schoolSchedule = schoolSchedule;
        this.goToSchool = goToSchool;
    }

    public void wakeUp() {
        if (schoolSchedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Do not go to school! Sleep more!");
        }else {
            System.out.println("It is a time to wake up!");
        }
    }
}

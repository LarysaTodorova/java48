package consultation5;

public class DayOffWeek {

   private int numberOffDay;
    private String day;

    public DayOffWeek(int numberOffDay, String day) {
        this.numberOffDay = numberOffDay;
        this.day = day;
    }

    public int getNumberOffDay() {
        return numberOffDay;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "DayOffWeek{" +
                "numberOffDay=" + numberOffDay +
                ", day='" + day + '\'' +
                '}';
    }
}

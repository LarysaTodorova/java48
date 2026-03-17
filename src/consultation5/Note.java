package consultation5;

public class Note {
    private int number;
    private String description;
    private DayOffWeek dayOffWeek;


    public Note(int number, String description, DayOffWeek dayOffWeek) {
        this.number = number;
        this.description = description;
        this.dayOffWeek = dayOffWeek;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public DayOffWeek getDayOffWeek() {
        return dayOffWeek;
    }

    @Override
    public String toString() {
        return "Note{" +
                "number=" + number +
                ", description='" + description + '\'' +
                ", dayOffWeek=" + dayOffWeek +
                '}';
    }
}


package consultation5;

public class NoteService {

    public Note createNote(int number, String description, int dayNumber){
        DayOffWeek dayOffWeek = getDayOffWeek(dayNumber);
        Note newNote = new Note(number,description, dayOffWeek);
        return newNote;

    }

    private DayOffWeek getDayOffWeek(int dayNumber) {

        DayOffWeek dayOffWeek;

        switch (dayNumber) {
            case 1:
                dayOffWeek =  new DayOffWeek(1, "Monday");
                break;
            case 2:
                dayOffWeek =  new DayOffWeek(2, "Tuesday");
                break;
            case 3:
                dayOffWeek =  new DayOffWeek(3, "Wednesday");
                break;
            case 4:
               dayOffWeek =  new DayOffWeek(4, "Thursday");
               break;
            case 5:
                dayOffWeek =  new DayOffWeek(5, "Friday");
                break;
            case 6:
                dayOffWeek =  new DayOffWeek(6, "Saturday");
                break;
            case 7:
                dayOffWeek =  new DayOffWeek(7, "Sunday");
                break;
            default:
                dayOffWeek =  new DayOffWeek(1,"Monday");

        }
        return dayOffWeek;
    }

    public void printNote(Note note){
        System.out.println("На " + note.getDayOffWeek().getDay() + " : ");
        System.out.println("Заметка №" + note.getNumber());
        System.out.println("Содержание: " + note.getDescription());

    }

}

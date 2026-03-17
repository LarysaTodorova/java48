package consultation8;

public class TimeTable {

    private String lessonTime;
    private Lesson lesson;

    public TimeTable(String lessonTime, Lesson lesson) {
        this.lessonTime = lessonTime;
        this.lesson = lesson;
    }

    public String getLessonTime() {
        return lessonTime;
    }

    public Lesson getLesson() {
        return lesson;
    }

    @Override
    public String toString() {
        return "TimeTable{" +
                "lessonTime='" + lessonTime + '\'' +
                ", lesson=" + lesson +
                '}';
    }
}

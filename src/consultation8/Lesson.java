package consultation8;

public class Lesson {
    private int lessonId;
    private String lessonNumber;

    public Lesson(int lessonId, String lessonNumber) {
        this.lessonId = lessonId;
        this.lessonNumber = lessonNumber;
    }

    public int getLessonId() {
        return lessonId;
    }

    public String getLessonNumber() {
        return lessonNumber;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonId=" + lessonId +
                ", lessonNumber='" + lessonNumber + '\'' +
                '}';
    }
}

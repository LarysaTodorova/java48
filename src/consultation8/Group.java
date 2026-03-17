package consultation8;

import java.util.Arrays;

public class Group {

    private int groupId;
    private String groupName;
    private Student[] student;
    private Lesson[] lesson;
    private TimeTable[] timeTable;

    public Group(int groupId, String groupName, Student[] student, Lesson[] lesson, TimeTable[] timeTable) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.student = student;
        this.lesson = lesson;
        this.timeTable = timeTable;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public Student[] getStudent() {
        return student;
    }

    public Lesson[] getLesson() {
        return lesson;
    }

    public TimeTable[] getTimeTable() {
        return timeTable;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", student=" + Arrays.toString(student) +
                ", lesson=" + Arrays.toString(lesson) +
                ", timeTable=" + Arrays.toString(timeTable) +
                '}';
    }

        }



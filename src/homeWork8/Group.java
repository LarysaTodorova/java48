package homeWork8;

public class Group {
    private String groupName;
   private String dateOfBeginning;
    private int studentCount;

    public Group(String groupName, String dateOfBeginning, int studentCount) {
        this.groupName = groupName;
        this.dateOfBeginning = dateOfBeginning;
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", dateOfBeginning='" + dateOfBeginning + '\'' +
                ", studentCount=" + studentCount +
                '}';
    }
}

package myselfWork39.back.entity;

import java.util.Date;

public class Note {
private int ID;
private String name;
private String description;
private Date createDate;

    public Note(int ID, String name, String description, Date createDate) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.createDate = createDate;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Note{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}

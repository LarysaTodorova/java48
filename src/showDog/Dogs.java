package showDog;

public class Dogs {
    private int dogId;
    private String dogName;
    private String dogBreed;

    public Dogs(int dogId, String dogName, String dogBreed) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
    }

    public int getDogId() {
        return dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                '}';
    }
}

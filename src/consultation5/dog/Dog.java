package consultation5.dog;

public class Dog {
    /*
    Создайте приложение для регистрации собак на выставку

"Собака на выставке"
- порядковый номер (присваивается автоматически)
- кличка
- порода

Зарегистрируйте три собаки
     */

    private String dogName;
    private String breed;
    private int dogId;

    public Dog(String dogName, String breed, int counter) {
        this.dogName = dogName;
        this.breed = breed;
        this.dogId = counter;
    }

    public String getDogName() {
        return dogName;
    }

    public String getBreed() {
        return breed;
    }

    public int getCounter() {
        return dogId;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", breed='" + breed + '\'' +
                ", counter=" + dogId +
                '}';
    }
}

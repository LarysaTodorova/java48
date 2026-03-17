package consultation5.dog;

public class CreateDog {

    private int dogId = 0;

    public Dog showDog(String dogName, String bred) {
        dogId = dogId + 1;
        Dog dog = new Dog( dogName, bred, dogId);
        return dog;

    }
}






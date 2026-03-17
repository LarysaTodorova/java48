package showDog;

import lesson5.superCalc.UserInput;

public class CreateDogs {

    private int dogId = 0;

    public Dogs dogsShow() {
        UserInput userInput = new UserInput();
        dogId = dogId + 1;
        String dogName = userInput.inputText("Dog name:");
        String dogBreed = userInput.inputText("Dog breed:");

        Dogs dogs = new Dogs(dogId, dogName, dogBreed);
        return dogs;

    }
}


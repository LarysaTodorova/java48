package consultation5.dog;

import lesson5.superCalc.UserInput;

public class DogDemo {
    public static void main(String[] args) {


        CreateDog createDog = new CreateDog();
        UserInput userInput = new UserInput();

        String name = userInput.inputText("Введите имя вашей собаки:");
        String breed = userInput.inputText("Введите породу собаки:");
        Dog dog1 =  createDog.showDog(name,breed);
        System.out.println("Your dog: "  + dog1);


         name = userInput.inputText("Введите имя вашей второй собаки:");
         breed = userInput.inputText("Введите породу собаки:");
         Dog dog2 =  createDog.showDog(name,breed);
         System.out.println("Your dog: "  + dog2);

         name = userInput.inputText("Введите имя вашей третьей собаки:");
         breed = userInput.inputText("Введите породу собаки:");
         System.out.println("Your dog: "  + createDog.showDog(name,breed));

    }

}

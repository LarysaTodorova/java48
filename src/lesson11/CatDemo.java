package lesson11;

import lesson5.superCalc.UserInput;

public class CatDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        boolean condition = true;

        while (condition){
            String catName = userInput.inputText("Введите имя кошки:");
            String catBreed = userInput.inputText("Введите породу кошки:");

            if (catName.isEmpty() || catBreed.isEmpty()){
                condition = false;
            }else {
                Cat cat = new Cat(catName,catBreed);
                System.out.println(cat);
            }
        }
        System.out.println("Цикл ввода данных о кошках завершен!");

    }

}

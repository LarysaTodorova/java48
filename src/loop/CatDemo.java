package loop;

import lesson5.superCalc.UserInput;

public class CatDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        boolean condition = true;

        while (condition){
            String name = userInput.inputText("Введите имя кошки:");
        String breed = userInput.inputText("Введите породу кощки:");

        if (name.isEmpty() || breed.isEmpty()){
            condition = false;

        }else {
            Cat cat = new Cat(name, breed);
            System.out.println(cat);
        }

    }
        System.out.println("Цикл ввода данных о кошках завершен!");
}
}

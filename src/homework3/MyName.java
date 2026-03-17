package homework3;

public class MyName {
    public static void main(String[] args) {

        Name myName = new Name();
        myName.name = "Mary";
        myName.age = 30;
        myName.city = "Izmail";

        System.out.println("Меня зовут = " + myName.name);
        System.out.println("Мой возраст = "+ myName.age);
        System.out.println("Мой город = " + myName.city);

        Name mySecondName = new Name();
        mySecondName.name = "Luisa";
        mySecondName.age = 50;
        mySecondName.city = "Paris";

        System.out.println("Меня зовут = " + mySecondName.name);
        System.out.println("Мой возраст = " + mySecondName.age);
        System.out.println("Moй город = " + mySecondName.city);

    }
}

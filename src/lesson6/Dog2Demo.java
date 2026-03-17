package lesson6;

public class Dog2Demo {
    public static void main(String[] args) {

        Dog2 myDog2 = new Dog2("BostonTerier", "Oskar", 5);
        myDog2.Dog2Construction();

        System.out.println(myDog2.getBreed());
        System.out.println(myDog2.getName());
        System.out.println(myDog2.getAge());


        myDog2.setAge(9);
        System.out.println("Теперь ему: " + myDog2.getAge());




    }
}
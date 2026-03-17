package lesson3;

public class ZooDemo {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.age = 3;
        myCat.breas = "Scotch";
        myCat.name = "Shu shu";


        Cat mySecondCat = new Cat();
        mySecondCat.breas = "Domashnya";
        mySecondCat.name = "Murka";
        mySecondCat.age = 7;


        Dog myDog = new Dog();
        myDog.name = "Oskar";
        myDog.age = 9;
        myDog.weight = 12.5;

        Dog mySecondDog = new Dog();
        mySecondDog.name = "Dicsy";
        mySecondDog.age = 4;
        mySecondDog.weight = 8.7;

        Hors myHors = new Hors();
        myHors.name = "Orlando";

        Hors mySecondHors = new Hors();
        mySecondHors.name = "Real";

        System.out.println("Poroda kota= " + myCat.breas);
        System.out.println("Imya kota = " + myCat.name);
        System.out.println("Vozrast kota = " + myCat.age);

        System.out.println("");


    }
}
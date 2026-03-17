package lesson6;

public class Dog {
   private String breed;
   private String name;
    private int age;

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public void dogConstructor(){

        System.out.println(" Мою собаку зовут: " + name);
        System.out.println(" Она породы: " + breed);
        System.out.println(" Ему: " + age);
    }

    public void changeAge(int newAge) {
        age = newAge;


    }

}

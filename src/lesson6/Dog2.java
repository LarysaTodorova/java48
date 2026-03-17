package lesson6;

public class Dog2 {

    private String breed;
    private String name;
    private int age;



    public Dog2(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;

    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Dog2Construction(){
        System.out.println(" Мою собаку зовут: " + name);
        System.out.println(" Она породы: " + breed);
        System.out.println(" Ему: " + age);
    }
}

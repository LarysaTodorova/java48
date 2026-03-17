package lesson20.interfaces3;

public class Demo {

    public static void main(String[] args) {

        Eagle eagle = new Eagle();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Person person = new Person();

        Flying[] flyings = {eagle, duck};

        Swimming[] swimmings = {duck, fish, person};

    }
}

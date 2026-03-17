package showDog;

public class DogsDemo {
    public static void main(String[] args) {

        CreateDogs createDogs = new CreateDogs();
        Dogs dog1 = createDogs.dogsShow();
        Dogs dog2 = createDogs.dogsShow();
        Dogs dog3 = createDogs.dogsShow();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);



    }
}

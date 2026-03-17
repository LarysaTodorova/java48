package homework35;

public class CatDemo {
    public static void main(String[] args) {

        CatService service = new CatService();

        Cat cat1 = new Cat("ShuShu","Seam");
        Cat cat2 = new Cat("Lucky","Breatish");
        Cat cat3 = new Cat("Markysa","Sphynks");
        Cat cat4 = new Cat("Pushok","Sphynks");

        service.addCat(cat1);
        service.addCat(cat2);
        service.addCat(cat3);
        service.addCat(cat4);

        System.out.println(service.findCatByName("ShuShu"));
        System.out.println(service.findCatsByBreed("Sphynks"));

    }
}

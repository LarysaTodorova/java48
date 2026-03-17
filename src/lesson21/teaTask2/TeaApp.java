package lesson21.teaTask2;

public class TeaApp {
    public static void main(String[] args) {


        TeaProducer teaProducer1 = new TeaProducer("Lipton");
        TeaProducer teaProducer2 = new TeaProducer("Apsara");
        TeaProducer teaProducer3 = new TeaProducer("GreenField");
        TeaProducer teaProducer4 = new TeaProducer("Askold");

        BlackTea tea1 = new BlackTea(1, teaProducer1, "Lemon");
        GreenTea tea2 = new GreenTea(2, teaProducer2,"Apple");
        HerbalTea tea3 = new HerbalTea(3, teaProducer3, "Melisa");
        BlackTea tea4 = new BlackTea(4, teaProducer4, "Earl Gray");
        GreenTea tea5 = new GreenTea(5,teaProducer1,"Apple");

        TeaCollection collection = new TeaCollection(5);

        collection.add(tea1);
        collection.add(tea2);
        collection.add(tea3);
        collection.add(tea4);
        collection.add(tea5);

        collection.printCollection();

        collection.delete(3);


        collection.printCollection();

        System.out.println(collection.findById(1));
        System.out.println(collection.findByName("Lemon"));

    }
}

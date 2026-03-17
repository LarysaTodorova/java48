package consultation17;

public class TourApp {
    public static void main(String[] args) {

        TourCollection collection = new TourCollection(5);

        collection.addRequest("Tour in Paris");
        collection.addRequest("Flight in London");
        collection.addRequest("Mediterranean cruse");
        collection.addRequest("Flight in New York");
        // collection.addRequest("Tour in Rome");
        // collection.addRequest("Tour in Greece");

        System.out.println(collection.getMaxSize());

        System.out.println(collection.getQueueSize());

        System.out.println(collection.getData());

        collection.processRequest();
        collection.processRequest();
        collection.processRequest();
        collection.processRequest();
        collection.processRequest();
        collection.processRequest();

        System.out.println(collection.getData());


    }
}

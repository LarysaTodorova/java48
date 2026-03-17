package homework32;

import java.util.LinkedList;
import java.util.Queue;

public class TourCollection {

    private Queue<String> tourRequests;
    private int maxSize;

    public TourCollection( int maxSize) {
        this.tourRequests = new LinkedList<>();
        this.maxSize = maxSize;
    }
}

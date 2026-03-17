package myselfWork;

public class SimpleNumberDemo3 {
    public static void main(String[] args) {

        SimpleNumber simpleNumber = new SimpleNumber();

        int counter = 1;

        for (int i = 2; i < 100; i++) {
            if (simpleNumber.isSimple(i)){
                System.out.println(counter  + "." + "число " + i + " является простым");
                counter++;
            }
        }

    }
}

package myselfWork;

public class SimpleNumberDemo2 {
    public static void main(String[] args) {

        SimpleNumber simpleNumber = new SimpleNumber();

        for (int i = 2; i < 100 ; i++) {
            if (simpleNumber.isSimple(i)){
                System.out.println(i);
            }

        }

    }
}

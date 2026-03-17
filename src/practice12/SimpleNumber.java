package practice12;

public class SimpleNumber {

    public boolean isSimple(int checkNumber){
        for (int i = 2; i < checkNumber ; i++) {
            if (checkNumber % i == 0) {
                return false;
            }

        }
        return true;
    }
}

package HomeWork11;

public class SimpleNumber {

    public boolean isSimple(int checkNumber){

        for (int i = 2; i < checkNumber; i++) {
            if (checkNumber %2 ==0){
            return false;
            }
    }
return true;
}
}

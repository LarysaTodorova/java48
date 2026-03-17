package practiceCodeWars;

public class Sentence {
    public static boolean hero(int bullet, int dragon) {
        if (bullet  <= dragon * 2) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hero(4, 2));
    }
}

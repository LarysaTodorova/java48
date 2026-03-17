package practiceCodeWars;

public class Sheep {
    public static String countingSheep(int num) {
        //Add your code here
        StringBuilder result = new StringBuilder();

        for(int i = 1; i <= num; i++) {
            result.append(i).append(" sheep... ");
        }
        return result.toString();
    }

    public static void main(String[] arg) {
        System.out.println(countingSheep(5));
    }
}

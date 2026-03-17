package consultation_java_basic;

public class StrigPractice {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" ").append("is").append(" ").append("best");

        System.out.println(sb);

        String string = sb.toString();
        System.out.println(string);

    }
}

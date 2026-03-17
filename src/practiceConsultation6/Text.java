package practiceConsultation6;

public class Text {

    /*
    У вас есть строка текста = "0123456789"

Необходимо распечатать каждую третий символ из текста
     */

    public static void main(String[] args) {

        String text = "0123456789";

        for (int i = 2; i < text.length(); i+= 3) {
            System.out.println(text.charAt(i));

        }
    }

}

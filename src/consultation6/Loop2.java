package consultation6;

import lesson5.superCalc.UserInput;

public class Loop2 {
    public static void main(String[] args) {

        /*
        У вас есть строка текста = "0123456789"
Необходимо распечатать каждую третий символ из текста
         */

        String text = "0123456789";

        for (int i = 2; i < text.length(); i+=3) {
            System.out.println(text.charAt(i));

        }

    }
}

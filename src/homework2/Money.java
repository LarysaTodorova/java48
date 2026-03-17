package homework2;

public class Money {
    public static void main(String[] args) {

        /* конвертировать  евро в доллары
        соотношение  1 EUR = 1,089 USD;
         */

        double EUR = 574;
        double rate = 1.089;
        double USD = EUR * rate;

        System.out.println(" конвертация евро в доллары = " + USD);

    }
}

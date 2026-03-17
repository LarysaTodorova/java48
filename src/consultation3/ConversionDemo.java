package consultation3;

public class ConversionDemo {
    public static void main(String[] args) {

        Conversion conversion = new Conversion();
        double celcius = 25;
        double farengeit = conversion.convertFromFariumInCels(celcius);
        System.out.println(" Значение в фаренгейтах = " + farengeit);



    }
}

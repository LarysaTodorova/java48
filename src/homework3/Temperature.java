package homework3;

public class Temperature {
    public static void main(String[] args) {

        double sundayAv = 18.0;
        double monAv = 16.5;
        double tuesAv = 15.5;
        double wenAv = 19.0;
        double thurAv = 15.0;
        double frAv = 14.5;
        double satAv = 17.0;
        double summe = (sundayAv+monAv+tuesAv+wenAv+thurAv+frAv+satAv);
        double average = (summe / 7);

        System.out.println("Средняя температура = " + average);


    }
}

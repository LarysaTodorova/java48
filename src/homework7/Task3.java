package homework7;

public class Task3 {
    public static void main(String[] args) {

        double pizza1 = 24;
        double pizza2 = 28;
        double calories = 40;
        double x1 = Math.PI * (pizza1 * pizza1) / 4;
        double x2 = Math.PI * (pizza2*pizza2) / 4;
        double x3 = (x2-x1)*calories;

        System.out.println(" Разница каллорий = " + x3);



    }


}

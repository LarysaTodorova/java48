package practice;

import java.util.Scanner;

public class Sunday {
    public static void main(String[] args) {


        Scanner myscanner = new Scanner(System.in);
        Sunday1 mySunday1 = new Sunday1();
        System.out.println("Введите первое слово:");
        String x = myscanner.nextLine();
        System.out.println(" You entered : " + x);
        String day = mySunday1.hallow("Hallow Sunday !");
        System.out.println(" You entered : " + day);


    }

}

package myselfWork;

import java.util.Scanner;

public class HomeScanner {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your name");
        String name = myScanner.nextLine();
        System.out.println("Hallow " + name + "!");

    }

}

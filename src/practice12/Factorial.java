package practice12;

public class Factorial {

    public int factor(int x){
        int factorial = 1;

        for (int i = 1; i <= x; i++) {

             factorial = factorial * i;

            }
        return factorial;
    }
}

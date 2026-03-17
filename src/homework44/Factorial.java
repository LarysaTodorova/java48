package homework44;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(-5));

        System.out.println(factorial(0));

        System.out.println(factorial(5));

        System.out.println(factorial(15));
    }

    public static int factorial(int x) {
        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return 1;
        }

        int factorial = 1;
        int maxIntValue = Integer.MAX_VALUE;

        for (int i = 1; i <= x; i++) {
            if (maxIntValue / i < factorial) {
                return -1;
            }
            factorial = factorial * i;
        }
        return factorial;
    }
}


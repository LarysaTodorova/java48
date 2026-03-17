package homework3;

public class Number {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;;
        int j = 7;
        int k = 8;
        int l = 9;
        int summe = (a+b+c+d+e+f+g+j+k+l);
        int average = ( summe / 10);
        int rest = summe % 10;

        System.out.println(" Сумма всех чисел = " + summe);
        System.out.println("Среднее арифметическое = " + average);
        System.out.println("Остаток от деления =" + rest);

    }


}

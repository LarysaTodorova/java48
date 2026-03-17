package practice;

public class CountDemo {

    public static void main(String[] args) {


        Count myCount = new Count();
        myCount.x  = 50;
        myCount.y = 20;
        int result = myCount.sub();
        System.out.println("Результат вычитания = " + result);

    }
}

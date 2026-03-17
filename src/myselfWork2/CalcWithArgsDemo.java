package myselfWork2;

public class CalcWithArgsDemo {

    public static void main(String[] args) {

       CalcWithArgs mycALCaRG = new CalcWithArgs();
       int sumResult = mycALCaRG.sum(20,10);
        System.out.println(" Результат сложения = " + sumResult);

        int divResult = mycALCaRG.div(90,30);
        System.out.println(" Результат вычитания = " + divResult);


    }
}

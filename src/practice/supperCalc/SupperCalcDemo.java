package practice.supperCalc;

public class SupperCalcDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        SupperCalc supperCalc = new SupperCalc();

        String userName = userInput.inputText(" Введите ваше имя");
        System.out.println(" Уважаемая " + userName);

        int x = userInput.inputInteger(" Введите первое число: ");
        int y = userInput.inputInteger(" Введите второе число: ");

        System.out.println(" Результат сложения чисел " + x + " и " +  y + " = " + supperCalc.sum( x, y));
        System.out.println(" Результат умножения чисел " + x + " и " + y + " = " + supperCalc.multi( x, y));
        System.out.println(" Резулитат вычитания чисел " + x + " и " + y + " = " + supperCalc.sub( x, y));
        System.out.println(" Результат деления чисел " + x + " и " + y + " = " + supperCalc.div( x, y));



    }
}

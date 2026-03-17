package lesson14;

import lesson5.superCalc.UserInput;

public class ArrayDemoWithMethods {
    public static void main(String[] args) {
        /*
    1) запросить и получить от пользователя длину массива
    2) создать массив нужной длины
    3) запросить от пользователя интервал значений для заполнения массива данными
    4) заполнить массив случайными числами в указанном интервале
    5) вывести информацию о массиве пользователю
     */

        ArrayService service = new ArrayService();
        UserInput userInput = new UserInput();

        int arraySize = userInput.inputInteger("Введите длину массива:");
        int[] myArray = service.createIntArray(arraySize);

        int min = userInput.inputInteger("Введите начало интервала значений:");
        int max = userInput.inputInteger("Введите конец интервала значений:");

        service.fillArrayByRandom(myArray,  min, max);
        service.printArrayData(myArray);

    }
}

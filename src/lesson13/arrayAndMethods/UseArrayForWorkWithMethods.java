package lesson13.arrayAndMethods;

import java.util.Arrays;

public class UseArrayForWorkWithMethods {
    /*
  будем использовать методы для решения каждой задачи
    и эти методы будут работать массивами

    создадим класс ArrayService
    в котором будут вспомогательные методы

    1) метод createArray - суть которого в создании нового массива
    2) fillArray - заполнение массива
    3) CalculateTotalSum
    4) findMax
     */
    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        int[] workingArray = service.createArray();
        System.out.println(Arrays.toString(workingArray));

        service.fillArray(workingArray);

        int sumAllElements = service.calculateTotalSum(workingArray);
        System.out.println("Сумма всех элементов массива = " + sumAllElements);

        int maxElementValue = service.findMax(workingArray);
        System.out.println("Максимальное значение элементов массива = " + maxElementValue);

        int averElement = service.avAllElements(workingArray);
        System.out.println("Среднее арифметическое значение массива = " + averElement);



    }
}

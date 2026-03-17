package lesson13.arrayAndMethods;

import lesson5.superCalc.UserInput;

public class ArrayService {

    UserInput userInput = new UserInput();

    public int[] createArray(){
        int lengthOurArray = userInput.inputInteger("Введите длину массива:");
        int[] workingArray = new int[lengthOurArray];
        return workingArray;
    }

    public void fillArray(int[] workingArray2) {
        for (int i = 0; i < workingArray2.length; i++) {
            workingArray2[i] = userInput.inputInteger("Введите значение " + i + " -ого элемента");

        }
    }

    public int calculateTotalSum(int[] workingArray3) {
        int sumAllElements = 0;
        for (int i = 0; i < workingArray3.length; i++) {
            sumAllElements =  sumAllElements + workingArray3[i];

        }
        return sumAllElements;

    }

    public int findMax(int[] workingArray4){
        int maxElementValue = workingArray4[0];

        for (int i = 1; i < workingArray4.length; i++) {
            if (workingArray4[i] > maxElementValue) {
            maxElementValue = workingArray4[i];
        }
        }

        return maxElementValue;
    }

    public int avAllElements(int[] workingArray5){
        int aver = calculateTotalSum(workingArray5) / workingArray5.length;
        return aver;


    }
}


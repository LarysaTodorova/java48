package homeworkProject.task1;

import lesson5.superCalc.UserInput;

import java.util.Arrays;

public class ArrayService {

    private int[] arrayForSort  = {10,999,50,3,500,777,6,525,666};
    UserInput userInput = new UserInput();


    public int createArrayFromUserInput() {
        System.out.println("Enter an array: ");
        int number = userInput.inputInteger("Number");
        return number;
    }

    public int[] sort() {
        boolean notSorted = true;
        int temp;

        while (notSorted) {
            notSorted = false;

            for (int i = 0; i < arrayForSort.length - 1; i++) {
                if (arrayForSort[i] < arrayForSort[i + 1]) {
                    temp = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[i + 1];
                    arrayForSort[i + 1] = temp;
                    notSorted = true;
                    System.out.println(Arrays.toString(arrayForSort));
        }
            }

        }
        return null;
    }

    public void printArray() {

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arrayForSort));

        }

        public int fillArrayFromUserInput() {
        int[] fillArray = new int[]{createArrayFromUserInput()};
        for (int array : fillArray) {
            add(array);
        }
        return fillArray.length;
        }

        public boolean add(int number) {
            for (int i = 0; i < arrayForSort.length; i++) {
                if (arrayForSort[i] == 0) {
                    arrayForSort[i] = number;
                    return true;
                }

            }
            return false;
        }
    }


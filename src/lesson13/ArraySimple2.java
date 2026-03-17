package lesson13;

import java.util.Arrays;

public class ArraySimple2 {
    public static void main(String[] args) {

        int[] oldArray = {10,20,30,40,50,60,70,80,90,100};

        // создать НОВЫЙ массив, в котором будут храниться значения из первого массива деленные на 10

        System.out.println(Arrays.toString(oldArray));

      //  int[] newArray = new int[10];

        int[] newArray = new int[oldArray.length];

     //   newArray[0] = oldArray[0] / 10;
     //   newArray[1] = oldArray[1] / 10;
     //   newArray[2] = oldArray[2] / 10;
     //   newArray[3] = oldArray[3] / 10;
    //    newArray[4] = oldArray[4] / 10;
     //   newArray[5] = oldArray[5] / 10;
     //   newArray[6] = oldArray[6] / 10;
      //  newArray[7] = oldArray[7] / 10;
     //   newArray[8] = oldArray[8] / 10;
     //   newArray[9] = oldArray[9] / 10;

     //   System.out.println(Arrays.toString(newArray));

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i] / 10;
        }

            System.out.println(Arrays.toString(newArray));


        }

    }


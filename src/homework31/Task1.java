package homework31;

import consultation7.LibraryServiceFind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Task1 {
 //  1) Проверить правильность последовательности из скобок
//
//            ()) )()( (()))
//
//    2) используя задачу на проверку правильности последовательности скобок добавить логику проверки если используются скобки (,),{,},[,]
//            (){}[] ({}) {}
//
//=========================================
//
//    1. проходим по нашему набору скобок
//    2. если символом является ЛЮБАЯ ОТКРЫВАЮЩАЯСЯ скобка, то мы добавляем ее в коллекцию
//    3. если символом является ЛЮБАЯ ЗАКРЫВАЮЩАЯСЯ скобка, то мы должны проверить является ли это закрывающаяся скобка парой для элемента из коллекции (вершина стека)
//    4. если "да" - то все ОК и мы переходим к следующему символу (удалив из стека вершину)
//    5. если "нет" - то последовательность некорректная

//    Дополнительная проверка -
//    проверка на то, что в нашем наборе четное/ нечетное количество скобок
//    проверка на то, что если скобка закрывающаяся, а стек пустой - то тоже некорректная
//    если строка закончилась, а стек еще не пуст - то тоже некорректная
//    пример (((( ))
//
//     *) для желающих - использовать для проверки пар скобок коллекцию map

    public static void main(String[] args) {
        String parenthesis = "()) )()( (()))";

        String parenthesis2 = parenthesis.replaceAll(" ", "");

        System.out.println(parenthesis2);

        String[] newParenthesis = parenthesis2.split("");

        int counterOpening = 0;
        int counterClosing = 0;

        for (int i = 0; i < newParenthesis.length; i++) {
            if (newParenthesis[i].equals("(")){
                counterOpening++;
            } else {
                counterClosing++;
            }
        }

        System.out.println(Arrays.toString(newParenthesis));

        if (counterClosing % 2 == 0){
            System.out.println("Number of closing parenthesis is even."+ counterClosing);
        } else {
            System.out.println("Number of closing parenthesis is uneven." + counterClosing);
        }

        if (counterOpening % 2 == 0){
            System.out.println("Number of opening parenthesis is even."+ counterOpening);
        } else {
            System.out.println("Number of opening parenthesis is uneven." + counterOpening);
        }


        Stack<String> openingParenthesis = new Stack<>();

        for (int i = 0; i < newParenthesis.length; i++) {
            if (newParenthesis[i].equals("(")) {
                openingParenthesis.push(newParenthesis[i]);
            }

            if (newParenthesis[i].equals(")")) {

                if (openingParenthesis.empty()) {
                    System.out.println("Sequence is incorrect...");
                    return;
                }
                if (openingParenthesis.peek() != null) {
                    openingParenthesis.pop();
                } else {
                    System.out.println("Sequence is incorrect...");
                    return;
                }
            }

        }

        if (!openingParenthesis.empty()){
            System.out.println("Sequence is incorrect...");
        }

        System.out.println("Sequence is correct!");



    }

}

package homework31;

import java.util.Arrays;
import java.util.Stack;

public class ParanthasisCheck2 {
    //    1) Проверить правильность последовательности из скобок
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
        String parenthesis = "(){}[] ({}) {}";

        String parenthesis2 = parenthesis.replaceAll(" ", "");
        System.out.println(parenthesis2);

        String[] newParenthesis = parenthesis2.split("");

        int counterOpening = 0;
        int counterClosing = 0;

        for (String s : newParenthesis) {
            if (s.equals("(") || s.equals("{") || s.equals("[")) {
                counterOpening++;
            } else {
                counterClosing++;
            }
        }

        System.out.println(Arrays.toString(newParenthesis));

        if (counterClosing % 2 == 0) {
            System.out.println("Number of closing parenthesis is even." + counterClosing);
        } else {
            System.out.println("Number of closing parenthesis is uneven." + counterClosing);
        }

        if (counterOpening % 2 == 0) {
            System.out.println("Number of opening parenthesis is even." + counterOpening);
        } else {
            System.out.println("Number of opening parenthesis is uneven." + counterOpening);
        }

        Stack<String> openingParenthesis1 = new Stack<>(); // ()
        Stack<String> openingParenthesis2 = new Stack<>(); // {}
        Stack<String> openingParenthesis3 = new Stack<>(); // []

        for (String s : newParenthesis) {
            switch (s) {
                case "(":
                    openingParenthesis1.push(s);
                    break;
                case "{":
                    openingParenthesis2.push(s);
                    break;
                case "[":
                    openingParenthesis3.push(s);
                    break;
                case ")":
                    if (openingParenthesis1.empty()) {
                        System.out.println("Sequence is incorrect...");
                        return;
                    }
                    openingParenthesis1.pop();
                    break;
                case "}":
                    if (openingParenthesis2.empty()) {
                        System.out.println("Sequence is incorrect...");
                        return;
                    }
                    openingParenthesis2.pop();
                    break;
                case "]":
                    if (openingParenthesis3.empty()) {
                        System.out.println("Sequence is incorrect...");
                        return;
                    }
                    openingParenthesis3.pop();
                    break;
            }
        }

        if (!openingParenthesis1.empty() || !openingParenthesis2.empty() || !openingParenthesis3.empty()) {
            System.out.println("Sequence is incorrect...");
        } else {
            System.out.println("Sequence is correct!");
        }
    }
}

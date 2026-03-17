package homework31;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserCheck {
    //    пишите программу, которая будет хранить "историю" браузера
//    написать методы, которые бы "добавляли" в "историю" просмотренные страницы (переменные String)
//
//    и позволяют посмотреть всю историю (распечатать построчно)
//
//    Задачу решить в двух вариантах:
//
//    хранить и вывести сперва старые данные, потом новые
//    хранить и вывести сперва новые данные, потом старые

    public static void main(String[] args) {

        Deque<String> browserHistory = new ArrayDeque<>();

        BrowserCheck browserCheck = new BrowserCheck();

        browserCheck.addToBrowserHistory(browserHistory, "Google");
        browserCheck.addToBrowserHistory(browserHistory, "Deepl");
        browserCheck.addToBrowserHistory(browserHistory, "ChatGPT");
        browserCheck.addToBrowserHistory(browserHistory, "Slack");
        browserCheck.addToBrowserHistory(browserHistory, "Zoom");
        browserCheck.addToBrowserHistory(browserHistory, "LMS");

        System.out.println("Old to New: ");
        browserCheck.printOldFirst(browserHistory);

        System.out.println("New to Old: ");
        System.out.println(browserCheck.reverseHistory(browserHistory));


    }

    public void addToBrowserHistory(Deque<String> history, String websiteName) {
        history.add(websiteName);
    }

    // Печать истории: сначала старые записи, потом новые
    public void printOldFirst(Deque<String> history) {
        for (String website : history) {
            System.out.println(website);
        }
    }

    // Возвращает историю в обратном порядке
    public Deque<String> reverseHistory(Deque<String> history) {
        Deque<String> reversedHistory = new ArrayDeque<>();
        for (String website : history) {
            reversedHistory.addFirst(website);
        }
        return reversedHistory;
    }
}

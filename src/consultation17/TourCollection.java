package consultation17;

import java.util.LinkedList;
import java.util.Queue;

public class TourCollection {

    private int maxSize;
    private Queue<String> data;

    public TourCollection(int maxSize) {
        this.maxSize = maxSize;
        this.data = new LinkedList<>();

    }

    public boolean addRequest(String request) {
        if (data.size() >= maxSize) {
            return false;
        }
        data.add(request);
        return true;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Queue<String> getData() {
        return data;
    }

    public int getQueueSize() {
        return data.size();
    }

    public void processRequest() {
        String request = data.poll();
        if (request == null) {
            System.out.println("Request is empty");
        } else {
            System.out.println(request);
        }
    }
}
/*
Управление туристическими запросами

Описание: Вам необходимо реализовать систему для управления туристическими запросами.
 Система должна позволять добавлять запросы в порядке их поступлений до достижения максимального размера коллекции (задается вами),
  и обрабатывать эти запросы по порядку их поступления. Каждый запрос представлен в виде строки (String),
   которая может содержать любую информацию, например, тип тура или спецификацию запроса клиента.
    Важной частью задачи является контроль за максимальным размером коллекции, чтобы предотвратить ее переполнение.

Требования:

Реализовать класс TourCollection с полями:

`Коллекция : коллекция для хранения туристических запросов.
int maxSize: максимально допустимый размер коллекции.
В классе TourCollection должны быть реализованы следующие методы:

Конструктор, принимающий maxSize и инициализирующий коллекцию.

addRequest(String request): добавляет запрос, если текущий размер коллекции меньше maxSize.
 В противном случае выводит сообщение о том, что коллекция запросов полна.

processRequest(): обрабатывает (удаляет) первый запрос из коллекции, выводя сообщение об обработке.
 Если коллекция пуста, выводит сообщение о том, что список запросов пуст.

getQueueSize(): возвращает текущий размер очереди.

Геттеры для доступа к коллекции и maxSize.

Эта система может быть использована в туристических агентствах для управления запросами клиентов, обеспечивая справедливое и эффективное обслуживание на основе принципа "первым пришел — первым обслужен".
 */
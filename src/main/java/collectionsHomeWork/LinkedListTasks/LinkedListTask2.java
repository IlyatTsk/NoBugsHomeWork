package collectionsHomeWork.LinkedListTasks;


/*
Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListTask2 {

    private final List<String> tasks;

    public LinkedListTask2() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void processTasks() {
        while (!tasks.isEmpty()) {
            String task = tasks.removeFirst();
            System.out.println("Обработка: " + task);
        }
    }
}

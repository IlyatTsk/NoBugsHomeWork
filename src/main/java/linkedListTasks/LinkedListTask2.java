package linkedListTasks;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTask2 {

    private final List<String> tasks;

    public LinkedListTask2() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(String newTask) {
        tasks.add(newTask);
    }

    public void processTask() {
        while (!tasks.isEmpty()) {
            String task = tasks.removeFirst();
            System.out.println("Обработка: " + task);
        }
    }
}

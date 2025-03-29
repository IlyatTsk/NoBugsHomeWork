package collectionsHomeWork.LinkedListTasks;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

//        LinkedListTask1 listStrings = new LinkedListTask1();
//
//        listStrings.addString("1");
//        listStrings.addString("2");
//        listStrings.addString("3");
//        listStrings.addString("4");
//        listStrings.addString("5");
//
//        listStrings.printStrings();

//        LinkedListTask2 listTask = new LinkedListTask2();
//
//        listTask.addTask("Первая задача");
//        listTask.addTask("Вторая задача");
//        listTask.addTask("Третья задача");
//        listTask.addTask("Четвертая задача");
//
//        listTask.processTasks();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Добавляем 5 чисел в очередь
        queue.add(10);
        queue.add(5);
        queue.add(20);
        queue.add(1);
        queue.add(15);

        // Удаление и вывод элементов в порядке возрастания
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
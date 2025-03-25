package linkedListTasks;

public class Main {

    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        LinkedListTask1 listString = new LinkedListTask1();

        listString.addString("Первая строка");
        listString.addString("Вторая строка");
        listString.addString("Третья строка");
        listString.addString("Четвертая строка");

        listString.printListString();

        // Задача 2
        System.out.println("Задача 2");

        LinkedListTask2 listTask = new LinkedListTask2();

        listTask.addTask("Первая задача");
        listTask.addTask("Вторая задача");
        listTask.addTask("Третья задача");
        listTask.addTask("Четвертая задача");

        listTask.processTask();

        //Задача 3
        System.out.println("Задача 3");


        LinkedListTask3 strings = new LinkedListTask3();

        strings.addString("1");
        strings.addString("2");
        strings.addString("3");
        strings.addString("4");
        strings.addString("5");

        strings.printFirstAndLastElement();

        //Задача 4
        System.out.println("Задача 4");

        LinkedListTask4 numbers = new LinkedListTask4();

        numbers.addNumber(1);
        numbers.addNumber(2);
        numbers.addNumber(3);
        numbers.addNumber(4);
        numbers.addNumber(5);

        numbers.printSumElements();

        //Задача 5
        System.out.println("Задача 5");

        LinkedListTask5 strings2 = new LinkedListTask5();

        strings2.addString("1");
        strings2.addString("2");
        strings2.addString("3");
        strings2.addString("4");
        strings2.addString("5");

        strings2.printStrings();
    }
}

package treeSetTasks;

public class Main {

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        TreeSetTask1 numbers = new TreeSetTask1();
        numbers.addNumber();

        //Задача 2
        System.out.println("Задача 2");

        TreeSetTask2 numbers2 = new TreeSetTask2();

        numbers2.checkUniqueNumber();
        numbers2.addNumber(1);
        numbers2.addNumber(6);
    }
}

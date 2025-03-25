package linkedHashSetTasks;

public class Main {

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        LinkedHashSetTask1 setStrings = new LinkedHashSetTask1();
        setStrings.addString();

        //Задача 2
        System.out.println("Задача 2");

        LinkedHashSetTask2 setStrings2 = new LinkedHashSetTask2();

        setStrings2.addUnique("1");
        setStrings2.addUnique("2");
        setStrings2.addUnique("1");
    }
}

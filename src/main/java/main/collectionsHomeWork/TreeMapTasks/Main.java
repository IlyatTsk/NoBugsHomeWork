package main.collectionsHomeWork.TreeMapTasks;

public class Main {

    public static void main(String[] args) {

        TreeMapTasks1 students = new TreeMapTasks1();

        students.addStudent("Tim", 15);
        students.addStudent("Oleg", 20);
        students.addStudent("Bob", 10);
        students.addStudent("Max", 12);
        students.printStudents();
    }
}

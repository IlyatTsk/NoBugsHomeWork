package main.collectionsHomeWork.TreeMapTasks;


import java.util.Map;
import java.util.TreeMap;

/*
Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
 */
public class TreeMapTasks1 {

    Map<String, Integer> students;

    public TreeMapTasks1() {
        this.students = new TreeMap<>();
    }

    public void addStudent(String name, int score) {
        students.put(name, score);
    }

    public void printStudents() {
        System.out.println(students);
    }


}

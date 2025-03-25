package treeMapTasks;

import java.util.Map;
import java.util.TreeMap;

/*
Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
Подсказка:
Используй TreeMap<String, Integer>
Добавляй пары с помощью put(name, score)
TreeMap сортирует ключи по алфавиту
Для вывода используй цикл for (Map.Entry<String, Integer> entry : map.entrySet())
Убедись, что имена добавляются в случайном порядке, чтобы увидеть сортировку по ключу
 */

public class TreeMapTask1 {

    Map<String, Integer> elements;

    public TreeMapTask1() {
        this.elements = new TreeMap<>();
    }

    public void addElement(String name, int score) {
        elements.put(name, score);
    }

    public void printElements() {
        System.out.println(elements);
    }
}
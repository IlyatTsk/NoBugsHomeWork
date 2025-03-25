package linkedHashMapTasks;

/*
Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
Подсказка:
Используй LinkedHashMap<String, Integer> или другой тип на выбор
Добавляй элементы методом put(key, value)
Используй цикл for (Map.Entry<K, V> entry : map.entrySet())
LinkedHashMap сохраняет порядок добавления — элементы выведутся в том же порядке, в котором были добавлены
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTask1 {

    Map<String, Integer> elements;

    public LinkedHashMapTask1() {
        this.elements = new LinkedHashMap<>();
    }

    public void addElement(String element, int value) {
        elements.put(element, value);
    }

    public void printElements() {
        System.out.println(elements);
    }
}

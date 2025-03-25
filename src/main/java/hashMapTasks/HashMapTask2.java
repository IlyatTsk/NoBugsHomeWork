package hashMapTasks;

/*
Задача 2:
Проверьте, есть ли определённое имя в HashMap.
Подсказка:
Используй метод containsKey("Имя")
Имя можно задать вручную или получить через Scanner
Если имя найдено — выведи возраст или сообщение "Найдено"
Если не найдено — выведи "Не найдено"
*/

import java.util.HashMap;
import java.util.Map;

public class HashMapTask2 {

    Map<String, Integer> person;

    public HashMapTask2() {
        this.person = new HashMap<>();
    }

    public void addPerson(String name, int age) {
        person.put(name, age);
    }

    public void isPersonInCollection(String name) {
        if (person.containsKey(name)) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }
    }
}

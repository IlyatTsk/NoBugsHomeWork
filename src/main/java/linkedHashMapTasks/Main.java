package linkedHashMapTasks;

public class Main {

    public static void main(String[] args) {

        LinkedHashMapTask1 elements = new LinkedHashMapTask1();

        elements.addElement("Первый", 1);
        elements.addElement("Второй", 2);
        elements.addElement("Третий", 3);
        elements.addElement("Четвертый", 4);
        elements.addElement("Пятый", 5);

        elements.printElements();
    }
}

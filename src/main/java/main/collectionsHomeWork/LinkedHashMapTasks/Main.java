package main.collectionsHomeWork.LinkedHashMapTasks;

public class Main {

    public static void main(String[] args) {
        LinkedHashMapTask1 elements = new LinkedHashMapTask1();

        elements.addElement("Первый элемент", 1);
        elements.addElement("Второй элемент", 2);
        elements.addElement("Третий элемент", 3);
        elements.addElement("Четвертый элемент", 4);
        elements.addElement("Пятый элемент", 5);

        elements.printElements();
    }
}

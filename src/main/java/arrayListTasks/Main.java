package arrayListTasks;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        ArrayListTask1 listNumber = new ArrayListTask1();

        listNumber.printNumbers();

        listNumber.addNumbers(6);
        listNumber.printNumbers();

        //Задача 2
        System.out.println("Задача 2");

        ArrayListTask2 listNumber2 = new ArrayListTask2();

        listNumber2.printEvenNumbers();

        listNumber.addNumbers(1);
        listNumber.addNumbers(2);
        listNumber.addNumbers(3);
        listNumber.addNumbers(4);

        listNumber2.printEvenNumbers();

        //Задача 3
        System.out.println("Задача 3");

        ArrayListTask3 listString = new ArrayListTask3();

        listString.addString("Один");
        listString.addString("Два");
        listString.addString("Три");
        listString.addString("Четыре");

        listString.printLongestString();

        //Задача 4
        System.out.println("Задача 4");
        ArrayListTask4 listNumber4 = new ArrayListTask4();

        listNumber4.addNumber(1);
        listNumber4.addNumber(2);
        listNumber4.addNumber(3);

        listNumber4.sumNumbers();

        //Задача 5
        System.out.println("Задача 5");
        ArrayListTask5 listNumber5 = new ArrayListTask5();

        listNumber5.addNumbers(1);
        listNumber5.addNumbers(2);
        listNumber5.addNumbers(3);
        listNumber5.addNumbers(4);

        listNumber5.printMaxNumber();
        listNumber5.printMaxNumber2();
    }
}
package main.exceptionAndGenericsHomeWork.generics.Task3;

public class Main {

    public static void main(String[] args) {

        Pair<String, String> pair1 = new Pair<>("Первое значение", "Второе значение");

        System.out.println(pair1.getT());
        System.out.println(pair1.getU());

        pair1.setT("Другое значение");
        pair1.setU("Другое значение2");


        System.out.println(pair1.getT());
        System.out.println(pair1.getU());

        Pair<Integer, String> pair2 = new Pair<>(1, "Пример");


        System.out.println(pair2.getT());
        System.out.println(pair2.getU());

        pair2.setT(2);
        pair2.setU("Другое значение");


        System.out.println(pair2.getT());
        System.out.println(pair2.getU());

    }
}

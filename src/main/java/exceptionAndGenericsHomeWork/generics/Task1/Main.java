package exceptionAndGenericsHomeWork.generics.Task1;

public class Main {
    public static void main(String[] args) {

        Box<Integer> box = new Box<>(1);

        System.out.println(box.getT());
        box.setT(2);
        System.out.println(box.getT());
    }
}

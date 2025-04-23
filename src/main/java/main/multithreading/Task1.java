package main.multithreading;

public class Task1 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет из Потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток прерван" + e.getMessage());
                    break;
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
package main.multithreading;

public class Task4 {

    public static class Counter {

        public static int counter = 0;

        public static int getCounter() {
            return counter;
        }

        public synchronized static void increment() {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Итоговое значение счетчика: " + Counter.getCounter());
    }
}

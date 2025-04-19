package multithreading;

public class Task3 {
    private static volatile boolean stop = false;
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
           while (!stop) {
               counter++;
           }
            System.out.println("Счетчик: " + counter);
        });
        thread.start();

        Thread.sleep(2000);
        stop=true;
    }
}

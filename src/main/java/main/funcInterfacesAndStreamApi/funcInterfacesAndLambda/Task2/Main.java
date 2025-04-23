package main.funcInterfacesAndStreamApi.funcInterfacesAndLambda.Task2;

public class Main {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r.run();
    }
}

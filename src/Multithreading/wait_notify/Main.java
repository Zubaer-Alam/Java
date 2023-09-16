package Multithreading.wait_notify;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine();

        Thread thread1 = new Thread(() -> {
            try {
                engine.releaseEnergy();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                engine.consumeFuel();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

package Multithreading.ReEntrantLocks;

public class Main {
    public static void main(String[] args) {
        ReEntrantLocks RELock = new ReEntrantLocks();

        Thread thread1 = new Thread(() -> {
            try {
                RELock.thread1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                RELock.thread2();
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
        RELock.end();
    }
}

package Multithreading.Semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        ExecutorService exe = Executors.newCachedThreadPool();

        for (int n = 0; n < 300; n++) {
            exe.submit(() -> {
                Messages.getValue().send();
            });
        }

        exe.shutdown();

        try {
            exe.awaitTermination(10, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

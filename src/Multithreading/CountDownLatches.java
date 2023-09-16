package Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private CountDownLatch latch;

    public Task(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println("Thread Started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        latch.countDown();
    }
}

public class CountDownLatches {
    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(5);
        ExecutorService exe = Executors.newFixedThreadPool(6);

        for (int i = 0; i < 6; i++) {
            exe.submit(new Task(latch));
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Threads Completed");
    }
}

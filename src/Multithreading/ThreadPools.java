package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tasks implements Runnable {
    private int id;

    public Tasks(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Task " + id + " started");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Task " + id + " finished");
    }
}

public class ThreadPools {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i < 6; i++){
            executor.submit(new Tasks(i));
        }
        executor.shutdown();

        System.out.println("Tasks are now submitted");

        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tasks are now finished");
    }
}



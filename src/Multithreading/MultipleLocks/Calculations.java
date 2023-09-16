package Multithreading.MultipleLocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Calculations {
    private final Random random = new Random();

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    // Simulate a calculation process for list1
    public void calculation1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1); // Simulate some processing time
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(200)); // Add a random number to list1

        }
    }

    // Simulate a calculation process for list2
    public void calculation2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1); // Simulate some processing time
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(200)); // Add a random number to list2
        }
    }

    // Perform calculations for both list1 and list2
    public void calculating() {
        for (int i = 0; i < 1000; i++) {
            calculation1(); // Perform calculation for list1
            calculation2(); // Perform calculation for list2
        }
    }

    // Entry point to run the calculations
    public void run() {
        System.out.println("Started...");

        long start = System.currentTimeMillis();

        Thread thread1 = new Thread(this::calculating);
        Thread thread2 = new Thread(this::calculating);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //calculating(); // Perform calculations

        long end = System.currentTimeMillis();

        long duration = end - start;

        System.out.println("Duration : " + duration + "ms");
        System.out.println("List 1: " + list1.size() + " ; List 2: " + list2.size());
    }
}

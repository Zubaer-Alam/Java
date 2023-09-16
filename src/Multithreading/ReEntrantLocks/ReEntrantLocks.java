package Multithreading.ReEntrantLocks;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLocks {
    private int value = 0;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    private void increment() {
        for (int i = 0; i < 20000; i++) {
            value++;
        }
    }

    public void thread1() throws InterruptedException {
        lock.lock();

        System.out.println("WAITING");

        condition.await();

        System.out.println("Another thread woke me up");

        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void thread2() throws InterruptedException {
        Thread.sleep(3000);
        lock.lock();

        System.out.println("Press ENTER to Continue");
        new Scanner(System.in).nextLine();
        System.out.println("You pressed ENTER");

        condition.signal();

        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void end() {
        System.out.println("Value is : " + value);
    }
}

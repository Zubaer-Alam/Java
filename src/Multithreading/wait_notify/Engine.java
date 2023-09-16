package Multithreading.wait_notify;

import java.util.Scanner;

public class Engine {
    public void releaseEnergy() throws InterruptedException {
        synchronized (this) {
            System.out.println("Engine ON");
            wait();
            System.out.println("Resumed");
        }
    }

    public void consumeFuel() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Press Enter to resume");
            input.nextLine();
            System.out.println("Enter key pressed");
            notify();
        }
    }
}

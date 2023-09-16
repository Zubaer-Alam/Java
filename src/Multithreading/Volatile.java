package Multithreading;

import java.util.Scanner;

class Engine extends Thread{
    private volatile boolean isOn = true;

    public void run() {
        while(isOn){
            System.out.println("Engine Running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void off(){
        isOn = false;
        System.out.println("Engine has stopped");
    }
}

public class Volatile {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        engine1.start();

        System.out.println("Press Enter to stop");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        engine1.off();
    }
}

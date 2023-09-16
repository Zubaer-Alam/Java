package Multithreading.Semaphores;

import java.util.concurrent.Semaphore;

public class Messages {
    private static final Messages value = new Messages();
    private int messages = 0;
    private final Semaphore semaphore = new Semaphore(20);

    private Messages() {

    }

    public static Messages getValue() {
        return value;
    }

    public void send(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            sendMsg();
        }finally {
            semaphore.release();
        }
    }

    public void sendMsg() {

        synchronized (this){
            messages++;
            System.out.println("Current number of messages : "+messages);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (this){
            messages--;
        }
    }
}

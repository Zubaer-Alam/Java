package Multithreading;

class Threads1 extends Thread{
    public void run(){
        for(int i = 0; i<100 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        Threads1 thread1 = new Threads1();
        Threads1 thread2 = new Threads1();

        thread1.start();
        thread2.start();
    }
}

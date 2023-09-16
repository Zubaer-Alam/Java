package Multithreading;

class Threads2 implements Runnable{
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class runnable1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Threads2());
        Thread thread2 = new Thread(new Threads2());

        thread1.start();
        thread2.start();
    }

}

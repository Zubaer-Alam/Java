package Multithreading;

public class synchronisation {
    private int number = 0;

    public synchronized void increment(){
        number++;
    }

    public static void main(String[] args) {
        synchronisation sync = new synchronisation();
        sync.multiThread();
    }

    public void multiThread() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int n = 0; n < 20000; n++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int n = 0; n < 20000; n++){
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(number);
    }
}

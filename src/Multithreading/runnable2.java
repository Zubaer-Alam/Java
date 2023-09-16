package Multithreading;

public class runnable2 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 0;i<100;i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
    }
}

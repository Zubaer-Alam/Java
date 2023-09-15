package OOP.anonymousClasses;

class Computer{
    public void shutDown(){
        System.out.println("SHUTTING DOWN");
    }
}

interface Phone{
    void call();
}
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computer1 = new Computer(){
            @Override
            public void shutDown(){
                System.out.println("MACBOOK SHUTTING DOWN");
            }
        };
        computer.shutDown();
        computer1.shutDown();

        Phone phone = new Phone() {
            @Override
            public void call() {
                System.out.println("CALLING...");
            }
        };
        phone.call();
    }
}

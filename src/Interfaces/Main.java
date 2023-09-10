package Interfaces;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.start();

        Vehicle vehicle1 = new Vehicle("Car");
        vehicle1.drive();

        Information info1 = new Computer();
        info1.displayInformation();

        Information info2 = vehicle1;
        info2.displayInformation();

        showInformation(computer1);
        showInformation(vehicle1);
    }

    private static void showInformation(Information info){
        info.displayInformation();
    }
}

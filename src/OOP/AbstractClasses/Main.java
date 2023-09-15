package OOP.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine("Hybrid");
        car.drive();

        Truck truck = new Truck();
        truck.setEngine("Diesel");
        truck.drive();

        // Vehicle vehicle = new Vehicle();
        // cannot be instantiated
    }
}

package Polymorphism;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Car car = new Car();

        Vehicle vehicle2 = car;

        vehicle2.design();
        car.ride();

        /*vehicle2.ride(): will not work,
        because ride() is not defined in Vehicle
        */

        createDesign(car);
    }
    public static void createDesign(Vehicle vehicle){
        vehicle.design();
    }
}

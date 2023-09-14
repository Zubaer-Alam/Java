package LambdaExpressions;

// Interfaces with just one method are called Functional Interfaces.
interface FunctionalInterface {
    int start(int value);
}

class Car {
    public void drive(FunctionalInterface obj) {
        System.out.println("Driving the car...");
        int number = obj.start(2);
        System.out.println("Returning the Number: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // Anonymous Class
        car.drive(new FunctionalInterface() {
            @Override
            public int start(int value) {
                System.out.println("Start Driving");
                return 15 * value;
            }
        });

        System.out.println();

        // Lambda Expression
        // Lambda Expressions are always associated with Functional Interfaces.
        car.drive((int value) -> {
            System.out.println("Start Driving with Lambda");
            return 20;
        });

        car.drive(value -> 100 * value);
    }
}

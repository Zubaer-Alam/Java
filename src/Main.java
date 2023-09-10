class Car{
    String brand;
    String model;
    int year;

    public Car(String brand, String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Year: "+year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Camry",2022);
        Car car2 = new Car("Honda","Civic", 2021);

        System.out.println("Car1: ");
        car1.displayInfo();

        System.out.println("Car2: ");
        car2.displayInfo();
    }
}
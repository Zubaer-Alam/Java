package OOP.Polymorphism;

public class Car extends Vehicle{
    @Override
    public void design() {
        System.out.println("Car Design");
    }
    public void ride(){
        System.out.println("Riding the Car");
    }
}

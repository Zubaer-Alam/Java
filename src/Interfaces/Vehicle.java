package Interfaces;

public class Vehicle implements Information{
    private String type;
    public void drive(){
        System.out.println("Driving");
    }
    public Vehicle(String type){
        this.type = type;
    }
    @Override
    public void displayInformation(){
        System.out.println("Vehicle type is:"+type);
    }
}

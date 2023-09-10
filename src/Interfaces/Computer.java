package Interfaces;

public class Computer implements Information {
    private int serialNumber = 170042051;
    public void start(){
        System.out.println("ON");
    }

    @Override
    public void displayInformation() {
        System.out.println("Computer Serial is:"+serialNumber);
    }
}

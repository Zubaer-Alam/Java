package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Reading {
    public static void main(String[] args) {
        System.out.println(("Reading objects..."));

        try (FileInputStream fileInput = new FileInputStream("Vehicle.data")) {
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            Vehicle[] vehicle = (Vehicle[])objectInput.readObject();

            ArrayList<Vehicle> vehicleList = (ArrayList<Vehicle>) objectInput.readObject();

            for(Vehicle v : vehicle){
                System.out.println(v);
            }

            System.out.println();

            for(Vehicle v:vehicleList){
                System.out.println(v);
            }

            objectInput.close();

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}

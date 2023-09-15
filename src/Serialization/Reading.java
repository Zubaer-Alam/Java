package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reading {
    public static void main(String[] args) {
        System.out.println(("Reading objects..."));

        try(FileInputStream fileInput = new FileInputStream("Vehicle.data")){

            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            Vehicle vehicle1 = (Vehicle)objectInput.readObject();
            Vehicle vehicle2= (Vehicle)objectInput.readObject();

            objectInput.close();

            System.out.println(vehicle1);
            System.out.println(vehicle2);

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}

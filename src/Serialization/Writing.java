package Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*
     serialization refers to the process of converting Java objects into a format that can be easily stored in a file. This allows us to persistently save these objects to a file, and later, if needed, deserialize (convert them back) to their original Java object form.
 */

public class Writing {
    public static void main(String[] args) {
        System.out.println("Writing Objects...");

        Vehicle[] vehicles = {new Vehicle(1, "Toyota"),
                new Vehicle(2, "Honda"),
                new Vehicle(3, "Ford")};

        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>(Arrays.asList(vehicles));

        try (FileOutputStream fileOutput = new FileOutputStream("Vehicle.data");
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {

            objectOutput.writeObject(vehicles);
            objectOutput.writeObject(vehicleList);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

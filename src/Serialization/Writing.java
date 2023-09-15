package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writing {
    public static void main(String[] args) {
        System.out.println("Writing Objects...");

        Vehicle car = new Vehicle(1, "Toyota");
        Vehicle truck = new Vehicle(2, "Ford");

        System.out.println(car);
        System.out.println(truck);

        try (FileOutputStream fileOutput = new FileOutputStream("Vehicle.data")) {

            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            objectOutput.writeObject(car);
            objectOutput.writeObject(truck);

            objectOutput.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

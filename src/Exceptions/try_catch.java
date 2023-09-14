package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Will print if example.txt is found");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }
        System.out.println("Prints anyway");
    }
}

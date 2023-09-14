package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throws_ {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("example.txt");
        Scanner scanner = new Scanner(file);
    }
}

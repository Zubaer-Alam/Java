package Exceptions.MultipleExceptions;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        MultipleExceptions me = new MultipleExceptions();
        try {
            me.start();
        } catch (ParseException | IOException e) {
            System.out.println("Incorrect Format");
        }

        MultipleExceptions me2 = new MultipleExceptions();
        try {
            me2.start();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

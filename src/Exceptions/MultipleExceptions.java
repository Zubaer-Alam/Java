package Exceptions;

import java.io.IOException;
import java.text.ParseException;

class Exceptions {
    public void start() throws ParseException, IOException {
        //throw new IOException();
        throw new ParseException("error",2);
    }
}

public class MultipleExceptions {
    public static void main(String[] args) {
        Exceptions me = new Exceptions();
        try {
            me.start();
        } catch (ParseException | IOException e) {
            System.out.println("Incorrect Format");
        }

        Exceptions me2 = new Exceptions();
        try {
            me2.start();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

package Exceptions.MultipleExceptions;

import java.io.IOException;
import java.text.ParseException;

class MultipleExceptions {
    public void start() throws ParseException, IOException {
        //throw new IOException();
        throw new ParseException("error",2);
    }
}

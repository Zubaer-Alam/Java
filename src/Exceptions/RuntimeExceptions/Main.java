package Exceptions.RuntimeExceptions;
/*
    There are 2 types of exceptions in Java, checked and unchecked exceptions.
    We are forced to handle checked exceptions. Not such a case for unchecked exceptions.
    Unchecked exceptions are also called runtime exceptions. An example of such an
    exception is Divide by zero. Runtime exceptions are serious issues. They are fundamental
    errors in the program.
 */
public class Main {
    public static void main(String[] args) {
        /*
            int value = 11;
            value = value/0;
            Throws ArithmeticException
        */

        /*
            String empty=null;
            System.out.println(empty.length());
            Throws NullPointerException
        */

        String[] numbers = {"one","two","three"};
        System.out.println(numbers[3]);
        //  Throws ArrayIndexOutOfBoundsException
    }
}

package Basics;

public class ternary {
    public static void main(String[] args) {
        boolean condition = true;
        System.out.println(condition ? "if true" : "if false");

        int number = 19;
        number = number > 20 ? number : 20;
        System.out.println(number);

        int[] numbers = {5, 43, 75, 57, 84};
        int lowestNumber = Integer.MAX_VALUE;
        for (int currentNumber : numbers){
            lowestNumber = currentNumber < lowestNumber ?currentNumber:lowestNumber;
        }
        System.out.println(lowestNumber);
    }
}

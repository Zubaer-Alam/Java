package enums;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Color color = Color.RED;
        switch (color) {
            case RED -> System.out.println("Red");
            case GREEN -> System.out.println("Green");
            case BLUE -> System.out.println("Blue");
        }
        System.out.println(Color.GREEN);
        System.out.println(Color.GREEN.getClass());
        System.out.println(Color.RED.getMeaning());
        System.out.println(Color.RED);
        System.out.println("Enum meaning as a string: "+Color.BLUE.name());
        Color color1 = Color.valueOf("GREEN");
        System.out.println(color1);
    }
}

package Basics;

import java.util.Objects;

class Laptop {
    private int id;
    private String brand;

    public Laptop(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && Objects.equals(brand, laptop.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand);
    }
}

public class equals {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(1, "HP");
        Laptop laptop2 = new Laptop(2, "Lenovo");

        System.out.println(laptop2 == laptop1);
        /*
            The equals operator compares two objects and returns true
            or false based on whether they are same or not.
            If we put same id and brand in both object creations, we will
            still get false as an output because although the id are
            different, the objects are not the same in terms of memory
            and Hashcode.
         */

        Laptop laptop3 = new Laptop(3,"Dell");
        Laptop laptop4 = new Laptop(3,"Dell");

        System.out.println(laptop3 == laptop4); // returns false

        System.out.println(laptop3.equals(laptop4));
        //This is our modified/overridden equals() methods

        int firstNumber = 8;
        int secondNumber = 8;

        System.out.println(firstNumber == secondNumber);

        String a = "yes";
        String b = "yesopss".substring(0,3);

        System.out.println(a == b);
        System.out.println(b);

        System.out.println(new Object());
    }
}

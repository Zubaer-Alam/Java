package Basics;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*When you try to print an object, the system tries to invoke the
     toString method to get the String representation of the object.
     And if you don't have toString method defined, you will get the name
     followed by the hashcode of the object.
    */
    public String toString() {
        return ("ID: " + id + "\n" + "Name: " + name);
    }
}

public class toString {
    public static void main(String[] args) {
        Employee employee1 = new Employee(51,"Zubaer");
        Employee employee2 = new Employee(52,"Nix");
        System.out.println(employee1);
        System.out.println(employee2);
    }
}

package OOP.Encapsulation;

import java.util.Scanner;

class Student{
    //Private instance Variables
    private String name;
    private int age;
    private double gpa;

    //Constructor
    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    //Getter method for name
    public String getName(){
        return name;
    }
    //Setter method for name
    public void setName(String name){
        this.name = name;
    }
    //Getter method for age
    public int getAge(){
        return age;
    }

    //Setter method for age
    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }else {
            System.out.println("Age cannot be negative");
        }
    }

    //Getter method for GPA
    public double getGpa(){
        return gpa;
    }
    //Setter method for GPA
    public void setGpa(double gpa){
        if(gpa >= 0 && gpa <= 4.0){
            this.gpa = gpa;
        } else {
            System.out.println("Invalid Input");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User Inputs
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Age: ");
        int age = scanner.nextInt();

        System.out.println("GPA: ");
        double gpa = scanner.nextDouble();

        //Create a student object with the provided inputs
        Student student = new Student(name,age,gpa);
        System.out.println("\n Student Information:");
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("GPA: "+student.getGpa());

        scanner.close();
    }
}
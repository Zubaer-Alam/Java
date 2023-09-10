class Student {
    public static final int MY_CONSTANT = 8;
    public String name;

    // Static variables also known as class variables, or
    // instance variables don't send copies to every object created.
    public static String studentClass;
    public static int count = 0;
    public Student(){
        count++;
    }

    public void studentInfo(){
        System.out.println(name+" is enrolled in "+studentClass);
        // Non-static methods can access static variables
    }


    public static void classInfo(){
        System.out.println(studentClass);
        //Static methods can access static variables only.
        //System.out.println(name);
        //will not work.
    }
}
public class Application{
    public static void main(String[] args) {
        Student.studentClass = "Web development";
        Student.classInfo();
        System.out.println(Student.studentClass);
        System.out.println(Student.MY_CONSTANT);

        System.out.println("Before creating object count = "+Student.count);
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println("After creating object, count = "+Student.count);

        student1.name = "Zubaer";
        student2.name = "Sunny";

        System.out.println(student1.name);
        System.out.println(student2.name);

        student1.studentInfo();
        student2.studentInfo();
    }
}

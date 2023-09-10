class Student {
    public String name;

    // Static variables also known as class variables, or
    // instance variables don't send copies to every object created.
    public static String studentClass;

    public void studentName(){
        System.out.println(name+" is enrolled in "+studentClass);
        // Non-static methods can access static variables
    }

    // Static methods can access static variables only.
    public static void classInfo(){
        System.out.println(studentClass);

        //System.out.println(name);
        //will not work.
    }
}
public class Application{
    public static void main(String[] args) {
        Student.studentClass = "Web development";
        Student.classInfo();
        System.out.println(Student.studentClass);

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Zubaer";
        student2.name = "Sunny";

        System.out.println(student1.name);
        System.out.println(student2.name);

        student1.studentName();
        student2.studentName();
    }
}

package Inheritance;

public class Main {
    /*Access modifiers:
       Public: Can access these methods from any class across packages.
       Protected: Can access these methods from any class in same package.
       Default: Similar to Public, given in absence of access modifier.
       Private: Can access these methods within class.
     */
    public static void main(String[] args) {
        Factory factory1 = new Factory();

        factory1.design();
        factory1.build();

        Car car1 = new Car();

        car1.design();
        car1.build();
    }
}

public class Main {
    public static void main(String[] args) {
        Factory factory1 = new Factory();

        factory1.design();
        factory1.build();

        Car car1 = new Car();

        car1.design();
        car1.build();
    }
}

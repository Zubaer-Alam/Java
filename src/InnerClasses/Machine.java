package InnerClasses;

public class Machine {
    private int id;

    // Non-static innerClasses are used when you want to group some functionality,
    // and you need the class to have access to the instance variables of the outer class
    class ArtificialIntelligence{
        public void activate(){
            System.out.println("AI on machine "+id+" is activated");
        }
    }
    // Static inner classes are used when you just want a normal class that isn't related
    // to the instances of the outer class but for some reason you want to group it with
    // the outer class. Other than that, it is just a normal class.
    static class Tire{
        public void repair(){
            System.out.println("Tires are repaired");
        }
    }

    public Machine(int id){
        this.id = id;
    }
    public void run(){
        System.out.println("Running machine "+id);
        ArtificialIntelligence AI = new ArtificialIntelligence();
        AI.activate();
        final String type = "Electric";
        class Test{
            public void example(){
                System.out.println("ID is: "+id);
                System.out.println("Type is "+type);
            }
        }
        Test test = new Test();
        test.example();
    }
}

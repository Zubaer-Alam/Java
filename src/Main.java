public class Main {
    public static void main(String[] args) {
        int amount = 20;
        if(amount<30){
            System.out.println("Less than 30");
        }
        else{
            System.out.println("More than 30");
        }

        //Shorthand with ternary operator
        String result = ( amount > 30 ) ? "More than 30" : "Less than 30";
        System.out.println( result );
    }
}

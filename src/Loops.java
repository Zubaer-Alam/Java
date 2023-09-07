import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Loops {
    public static void loops(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int limit = input.nextInt();

        while(number<=limit){
            System.out.print(number + " ");
            number+=2;
        }
        System.out.println(" ");
        for (int i = 0; i < 10 ; i++) {
            System.out.print(i + " ");
        }

        for(char c = 'a' ; c < 'd'; c++){
            System.out.print(c);
        }
        //Outputs abc
        System.out.println("\n");
        double aDouble = input.nextDouble();
        System.out.println(aDouble);
    }
}

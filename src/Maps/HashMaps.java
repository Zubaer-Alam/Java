package Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> people = new HashMap<>();

        people.put(1,"Zubaer");
        people.put(2,"Sunny");
        people.put(3,"Rafi");
        people.put(4,"Faiad");
        // This generates a lookup table.


        String person1 = people.get(1);
        String ghost  = people.get(5); // Nothing is mapped to this key.

        System.out.println(person1);
        System.out.println(ghost); // Generates null since nothing is mapped to this int.

        people.put(1,"Milon"); // Will overwrite "Zubaer" with "Milon"

        System.out.println(people.get(1));

        System.out.println();

        for (Map.Entry<Integer,String> person: people.entrySet()) {
            int key = person.getKey();
            String name = person.getValue();

            System.out.println(key+" : "+name);
        }
    }
}

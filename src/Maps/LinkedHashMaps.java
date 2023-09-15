package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

// Unlike HashMaps, LinkedHashMaps store the data on the order they were pushed in.

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> friends = new LinkedHashMap<>();

        friends.put(62,"Rafael");
        friends.put(82,"Sadat");
        friends.put(69,"Fuad");
        friends.put(21,"Swatcha");
        friends.put(17,"Sun");

        printMap(friends);
    }

    public static void printMap(Map<Integer,String> friends){
        for(Integer key : friends.keySet()){
            String friend = friends.get(key);
            System.out.println(key+" : "+friend);
        }
    }
}

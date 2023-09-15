package Maps;

import java.util.Map;
import java.util.TreeMap;

// TreeMap stores the data in a sorted way e.g 1,2,3,4,5 for integers / a,b,c,d,e for characters

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer, String> family = new TreeMap<>();

        family.put(2, "Ammu");
        family.put(1, "Abbu");
        family.put(3, "Mishu");
        family.put(5, "Zunaed");
        family.put(4, "Zobaidaa");

        sortMap(family);
    }

    public static void sortMap(Map<Integer, String> family) {
        for (Integer priority : family.keySet()) {
            String member = family.get(priority);
            System.out.println(priority + " : " + member);
        }
    }
}

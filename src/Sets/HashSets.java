package Sets;

import java.util.HashSet;

// HashSets randomly reorders the items stored in them.

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Blue"); // duplicates won't be added

        System.out.println(colors);
    }
}

package Sets;

import java.util.LinkedHashSet;

// LinkedHashSets preserve the order of the elements when they are added.

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<String> alphabet = new LinkedHashSet<>();

        alphabet.add("Cat");
        alphabet.add("Apple");
        alphabet.add("Fox");
        alphabet.add("Deer");
        alphabet.add("Ball");

        System.out.println(alphabet);
    }
}

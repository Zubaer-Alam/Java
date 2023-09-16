package Sets;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        // Create the first TreeSet for fruits
        TreeSet<String> fruits1 = new TreeSet<>();

        // Add fruits to TreeSet 1
        fruits1.add("Cherry");
        fruits1.add("Apple");
        fruits1.add("Fig");
        fruits1.add("Date");
        fruits1.add("Banana");

        // Print the sorted list of fruits in TreeSet 1
        System.out.println(fruits1);

        // Iterate over and print each fruit in TreeSet 1
        for (String fruit : fruits1) {
            System.out.println(fruit);
        }

        // Check if TreeSet 1 contains "Apple" and print the result
        if (fruits1.contains("Apple")) {
            System.out.println("Contains Apples");
        }

        // Create the second TreeSet for a different set of fruits
        TreeSet<String> fruits2 = new TreeSet<>();

        // Add fruits to TreeSet 2
        fruits2.add("Cherry");
        fruits2.add("Apple");
        fruits2.add("Mango");
        fruits2.add("Date");
        fruits2.add("Orange");

        // Find  and print the common fruits between TreeSet 1 and TreeSet 2
        //fruits1.retainAll(fruits2);
        //System.out.println(fruits1);

        // Create a TreeSet to store different items between fruits1 and fruits2
        TreeSet<String> differentItems = new TreeSet<>(fruits1);

        // Remove common elements with fruits2 from differentItems
        differentItems.removeAll(fruits2);

        // Print elements present in fruits1 but not in fruits2
        System.out.println(differentItems);
    }
}

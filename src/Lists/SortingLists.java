package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortStringLength implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        int length1 = string1.length();
        int length2 = string2.length();

        if (length1 > length2) {
            return 1;
        } else if (length1 < length2) {
            return -1;
        }
        return 0;
    }
}

class SortInAlphabeticalOrder implements Comparator<String> {

    @Override
    /*
     * Compares two strings lexicographically.
     *
     * @param string1 The first string to compare.
     * @param string2 The second string to compare.
     * @return A negative integer if string1 is lexicographically less than string2,
     *         a positive integer if string1 is lexicographically greater than string2,
     *         or 0 if the strings are lexicographically equal.
     */
    public int compare(String string1, String string2) {
        return string1.compareTo(string2);
    }
}

public class SortingLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Green");
        colors.add("Red");
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        //Collections.sort(colors, new SortStringLength());
        Collections.sort(colors, new SortInAlphabeticalOrder());
        System.out.println(colors);

        List<Integer> values = new ArrayList<>();

        values.add(3);
        values.add(1);
        values.add(2);
        values.add(5);
        values.add(4);

        Collections.sort(values, (o1, o2) -> -o1.compareTo(o2));
        System.out.println(values);
    }
}

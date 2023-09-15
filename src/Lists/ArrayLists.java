package Lists;

import java.util.ArrayList;

// ArrayList is a dynamic array of arrays. They look like [1][2][3][4].
// I can just keep adding on arrayList.
// Adding items to the beginning or the ending of the List is a bit slow.
// But adding items to the end is very fast.

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>(200);

        values.add(20);
        values.add(60);
        values.add(200);

        for(int i=0 ; i<values.size();i++){
            System.out.println(values.get(i));
        }

        values.remove(values.size()-1);

        System.out.println();

        for (Integer value : values) {
            System.out.println(value);
        }
    }
}

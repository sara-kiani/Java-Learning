package ir.javacup.Array;

import java.util.ArrayList;

public class CollectionToArray {
      public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);

        Object[] objArray = list.toArray();
        System.out.println("Object Array:");
        for (Object obj : objArray) {
            System.out.println(obj);
        }

        Integer[] intArray = list.toArray(new Integer[0]);
        System.out.println("Integer Array:");
        for (Integer num : intArray) {
            System.out.println(num);
        }
    }
}


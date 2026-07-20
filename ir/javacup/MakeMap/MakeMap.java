package ir.javacup.MakeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MakeMap {
    public static void main(String[] args) {
    // public static void main(String[] args) {
    //     //Map< String, Integer > Make_map = new HashMap<>();       //program{python=2, c++=3, java=1}
    //     //Map< String, Integer > Make_map = new LinkedHashMap<>() ; //program{java=1, python=2, c++=3}
    //     Map<String , Integer> Make_map = new TreeMap<>();           //program{c++=3, java=1, python=2}
    //     // Adding key-value pairs to the map
    //     Make_map.put("java", 1);
    //     Make_map.put("python", 2);
    //     Make_map.put("c++", 3);
    //     System.out.println("program" + Make_map);
    // HashMap (بدون ترتیب مشخص)
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("banana", 1);
        hashMap.put("apple", 2);
        hashMap.put("cherry", 3);
        System.out.println("HashMap: " + hashMap); // ممکن است ترتیب متفاوت باشد

        // LinkedHashMap (ترتیب درج)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("banana", 1);
        linkedHashMap.put("apple", 2);
        linkedHashMap.put("cherry", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap); // {banana=1, apple=2, cherry=3}

        // TreeMap (ترتیب طبیعی / الفبایی)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("banana", 1);
        treeMap.put("apple", 2);
        treeMap.put("cherry", 3);
        System.out.println("TreeMap: " + treeMap); // {apple=2, banana=1, cherry=3}
    }
}
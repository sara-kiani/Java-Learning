package ir.javacup.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sara");
        names.add("Ali");
        names.add("Reza");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        iterator = names.iterator(); 
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Ali")) {
                iterator.remove(); 
            }
        }
        System.out.println(names); // [Sara, Reza]
    }
}
//«هر بار که می‌خواهی یک Collection را پیمایش کنی، باید از آن یک Iterator جدید بگیری. نمی‌توان یک Iterator را دوبار استفاده کرد.»



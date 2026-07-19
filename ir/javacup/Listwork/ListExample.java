package ir.javacup.Listwork;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> Programming = new ArrayList<>();
        Programming.add("java");
        Programming.add("python");
        Programming.add(1,"c++");
        System.out.println("programm" + Programming);

        System.out.println("*********************************************");
//برای پیدا کردن عنصر مورد نظر از get استفاده میکنم 
        System.out.println(Programming.get(1));
        System.out.println(Programming.get(0));
        
        System.out.println("*********************************************");
        //برای جستجو به شکل زیر عمل میکنیم
        System.out.println("Is the Java language included in this program? "+Programming.contains("java"));
        System.out.println("index of python =  "+Programming.indexOf("python"));
        
        System.out.println("*********************************************");
        Programming.remove("c++");
        System.out.println(Programming);

        for(String program : Programming){
            System.out.println(program);
        }
    }
    
}

package ir.javacup.ThreadExample;

import java.util.*;

public class Threadproject  implements Runnable{
    String name ;
    int time ;
    Random r = new Random() ;

    public Threadproject(String num){
        name = num ;
        time = r.nextInt(999);
    }
    public void run(){
        try {
            System.out.printf("%s is sleeping for %d \n " , name , time);
            //%s >>>>>>>string == name
            //%d >>>>>>time == random 
            Thread.sleep(time);
            System.out.printf("%s is done \n "  , name);
            
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

}

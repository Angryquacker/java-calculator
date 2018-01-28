import java.lang.*;
import java.util.*;

public class Ran {
    public void Ran() {}
    
    public double genRan(int multiBy) {
        double r = Math.floor(Math.random() * multiBy);
        System.out.println("Your random number is: " + r);
        return r;
    }
    
    public static void main(String[] args) {
        Ran me = new Ran();
        me.genRan(10);
    }
}

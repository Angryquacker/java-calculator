import java.util.*;
import java.lang.*;

public class Monkey {
    public void Monkey() {
        
    }
    
    public double act() {
        double randomo = Math.random() * 10;
        if (randomo > 5) {
            System.out.println("He ate a banana!");
        }
        else {
            System.out.println("He farted out a banana!");
        }
        return randomo;
    }
    
    public static void main(String[] args) {
        Monkey steve = new Monkey();
        steve.act();
    }
}

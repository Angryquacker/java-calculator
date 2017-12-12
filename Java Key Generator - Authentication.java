/*
Java Key Generator And Authenticator
*/
import java.util.Random;

public class keyGen {
    public static void main(String[] args) {
        Random gen = new Random();
        //Generates New Key
        int key = gen.nextInt(999999999);
        //Checks if key is grater than X number
        if (key < 300000000) {
            key = 0;
        }
        System.out.println(key);
        //Authenticates key and prints response
        if (key == key && key > 300000000) {
            System.out.println("Key is Valid");
        }
        else {
            System.out.println("Key is Invalid");
        }
    }
}

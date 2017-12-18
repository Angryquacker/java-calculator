public class JavaJuice {
    public void JavaJuice() {
        
    }
    
    public void pour() {
        System.out.println("Pouring your Java Juice!");
    }
    
    public void drink() {
        System.out.println("You're drinking your Java Juice!");
    }
    
    public void refill() {
        System.out.println("Your Java Juice has been refilled!");
    }
    
    public static void main(String[] args) {
        JavaJuice steve = new JavaJuice();
        steve.pour();
        steve.drink();
        steve.refill();
    }
}

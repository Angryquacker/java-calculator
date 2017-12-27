/*
The meaning of life..........................................in Java
*/
public class Coffee {
  public void Coffee() {
    
  }
  public boolean checkIfEmpty(boolean fullStatus) {
    if (fullStatus) {
      System.out.println("Your Coffee is Full.");
      return true;
    }
    else {
      System.out.println("Your Coffe is Empty...");
      return false;
    }
  }
  public void refill(boolean fullStatus) {
   if (fullStatus == false) {
     System.out.println("Your Coffee has been Refilled.");
   }
    else {
     System.out.println("Your Coffe is Already Full."); 
    }
  }
  
  public static void main(String[] args) {
    boolean isFull = false;
    Coffee me = new Coffee();
    me.checkIfEmpty(isFull);
    me.refill(isFull);
  }
}

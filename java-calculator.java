/*
Simple Java Calculator That Can Add, Subtract, Multiply, Divide, or Modulo!
*/
public class Calculator {
  public void Calculator() {
    
  }
  
  public int add(int a, int b) {
		return a + b;
  }
  
  public int subtract(int a, int b) {
    return a - b;
  }
  
  public int multiply(int a, int b) {
    return a * b;
  }
  
  public int divide(int a, int b) {
    if (b == 0) {
      System.out.println("0 Divide Error");
      return 0;
    }
    else {
			return a / b;
    }
  }
  
  public int modulo(int a, int b) {
    if (b == 0) {
      System.out.println("0 Divide Error");
      return 0;
    }
    else {
      return a % b;
    }
  }
  
  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7)); //Output = 12
    System.out.println(myCalculator.subtract(45, 11)); //Output = 34
    System.out.println(myCalculator.multiply(234231, 901283)); //Output = 655020869
    System.out.println(myCalculator.divide(18123562, 89)); //Output = 203635
    System.out.println(myCalculator.modulo(12, 5)); //Output = 2;
    
  }
}

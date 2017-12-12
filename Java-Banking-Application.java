public class Bank {
    int balance;
    public void Bank() {
        int balance = 0;
    }
    
    public int deposit(int a) {
        if (a < 0) {
            System.out.println("You cannot deposit negitive dollars!");
        }
        else {
            balance = balance + a;
            return balance;
        }
        return balance;
    }
    
    public int withdraw(int a) {
        if (a < 0) {
            System.out.println("You cannot withdraw negitive dollars!");
        }
        else {
            balance = balance - a;
            return balance;
        }
        return balance;
    }
    
    public static void main(String[] args) {
        Bank travs = new Bank();
        System.out.println("Current Balance is: " + travs.deposit(10));
        System.out.println("Current Balance is: " + travs.withdraw(1));
        System.out.println("Current Balance is: " + travs.deposit(100));
        System.out.println("Current Balance is: " + travs.withdraw(1090));
    }
}
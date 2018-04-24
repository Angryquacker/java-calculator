import java.lang.Thread;

public class MyThread extends Thread {
    int id;
    public MyThread(int id) {
        this.id = id;
    }
    
    public void run() {
        System.out.println("Thread #" + id + " Has Executed");
    }
    
    public static void main(String[] args) {
        MyThread first = new MyThread(1);
        MyThread second = new MyThread(2);
        first.start();
        second.start();
    }
}

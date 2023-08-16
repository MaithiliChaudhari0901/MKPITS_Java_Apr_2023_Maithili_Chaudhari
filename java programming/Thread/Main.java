public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread1());
        Thread t1 = new Thread(new MyThread2());
        t.start();
        t1.start();

    }
}






public class MyThread2 implements Runnable {

    @Override
    public void run() {
        int num = 20;

        System.out.println("Enter the even number from 1 to " + num + ":");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
                try {
                    Thread.sleep(20);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException (e);

            }}
        }
    }
}





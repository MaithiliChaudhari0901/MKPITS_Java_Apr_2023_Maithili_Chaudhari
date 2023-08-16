public class MyThread1 extends Thread {
    @Override
    public void run() {
        int num = 10;
        System.out.println("Enter the odd number from 1 to " + num + ":");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "");
                try {
                    Thread.sleep(10);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException (e);


                }

            }
        }
    }
}


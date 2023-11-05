package td;

public class Thread_Extend {

        public static int totalmarks = 90;

        public static void main(String[] args) {
            Thread thread = new Thread();
            thread.start();
            System.out.println(totalmarks);
            totalmarks++;
            System.out.println(totalmarks);
        }
}

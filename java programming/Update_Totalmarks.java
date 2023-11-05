package td;

public class UpdateTotalmarks {

        public static int totalmarks = 65;

        public static void main(String[] args) {
            Thread thread = new Thread();
            thread.start();


            while(thread.isAlive()) {
                System.out.println("Load...");
            }
            // Update amount and print its value
            System.out.println("UpdateTotalmarks:"+totalmarks);
            totalmarks++;
            System.out.println("UpdateTotalmarks:"+totalmarks);
        }
}

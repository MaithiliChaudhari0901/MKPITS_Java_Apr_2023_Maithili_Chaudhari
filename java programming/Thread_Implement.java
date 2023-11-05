package td;
public class Thread_Implement {
    public static void main(String[] args) {
            Thread obj = new Thread();
            Thread thread = new Thread(obj);
            thread.start();
            System.out.println("Welcome to my home");
        }
        public void run() {
            System.out.println("Welcome to my college");
        }
    }

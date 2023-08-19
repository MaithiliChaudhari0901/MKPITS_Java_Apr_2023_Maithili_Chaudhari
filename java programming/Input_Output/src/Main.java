import java.io.*;
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number :");
        try {
            String nm = br.readLine();
            System.out.println("square:" + (Integer.parseInt(nm) * Integer.parseInt(nm)));
        } catch (IOException e) {

            throw new RuntimeException(e);

        }
        {
            System.out.println("Enter the name :");
            try {
                String nm = br.readLine();
                System.out.println("maithili:" + (nm));
            } catch (IOException e) {

                throw new RuntimeException(e);

            }
            {
                System.out.println("Enter the school :");
                try {
                    String nm = br.readLine();
                    System.out.println("G.R.kabra high school:" + (nm));
                } catch (IOException e) {

                    throw new RuntimeException(e);

                }
                System.out.println("Enter the bank :");
                try {
                    String nm = br.readLine();
                    System.out.println("Dena bank :" + (nm));
                } catch (IOException e) {

                    throw new RuntimeException(e);

                }
            }
        }
    }
}



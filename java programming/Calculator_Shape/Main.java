import java.util.Scanner;
import Calculator.*;

public class Main {
            public static void main(String[] args) {
                Calculation s;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter +,-,*,/");
                String choice = sc.next();
                int result;
                switch (choice) {
                    case "+":
                        s = new Addition();
                        System.out.println("enter two no:");
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        result = s.calculation(a, b);
                        System.out.println(result);
                        break;
                    case "-":
                        s = new Substraction();
                        System.out.println("enter two no:");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        result = s.calculation(a, b);
                        System.out.println(result);
                        break;
                }
            }
        }
import cal.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculation s;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter +,-,*,/");
         String choice=sc.next();
         int result;
         switch(choice)
         {
                 case "+":
                 s=new Addition();
                 System.out.println("enter two no:");
                 int a=sc.nextInt();
                 int b=sc.nextInt();
                 result=s.calculate(a,b);
                 System.out.println(result);

                 break;
                 case "-":
                     s=new Substraction();
                     System.out.println("enter two no:");
                     a=sc.nextInt();
                     b=sc.nextInt();
                     result=s.calculate(a,b);
                     System.out.println(result);
                     break;

             case "*":
                 s=new Multiplication();
                 System.out.println("enter two no:");
                 a=sc.nextInt();
                 b=sc.nextInt();
                 result=s.calculate(a,b);
                 System.out.println(result);
                 break;

             case"/":

                 s=new Division();
                 System.out.println("enter two no:");
                 a=sc.nextInt();
                 b=sc.nextInt();
                 result=s.calculate(a,b);
                 System.out.println(result);
                 break;





         }


    }
}
public static void main (String args[]) {
   float=num50.50
}
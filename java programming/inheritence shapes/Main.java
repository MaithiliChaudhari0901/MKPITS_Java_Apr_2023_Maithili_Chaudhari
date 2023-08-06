
import Shapes.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Shape s;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1-circle,enter 2-rectangle,enter 3-square:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter radius:");
                int r =sc.nextInt();
                s=new Circle(r);
                s.area();
                break;
            case 2:
                System.out.print("enter the length and breadth:");
                double l=sc.nextInt();
                double b=sc.nextInt();
                s=new Rectangle(sc.nextInt(),sc.nextInt());
                s.area();
                break;
            case 3:
                System.out.print("enter the side and side:");
                double a= sc.nextInt();
                double t= sc.nextInt();
                s=new Square(sc.nextInt());
                s.area();
                break;
            default:
                System.out.print("Invalid choice");
        }
    }
}
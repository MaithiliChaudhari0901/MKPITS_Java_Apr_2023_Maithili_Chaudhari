import java.util.Scanner;

public class Condition {
    public static void main(String args[]) {
        //age
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");

//even odd
            Scanner scanner1 = new Scanner(System.in);
            int x = scanner1.nextInt();
            if (x % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");

            //greater, lesser, equal
                Scanner scanner3 = new Scanner(System.in);
                int a = scanner3.nextInt();
                int b = scanner3.nextInt();
                if (a == b) {
                    System.out.println("equal");
                } else {
                    if (a > b) {
                        System.out.println(" a is greater");
                    } else {
                        System.out.println("a is lesser");

                     //button if else
                        Scanner scanner2 = new Scanner(System.in);
                        int button = scanner2.nextInt();
                        if (button == 1) {
                            System.out.println("hello");
                        } else {
                            if (button == 2) {
                                System.out.println("namaste");
                            } else {
                                if (button == 3) {
                                    System.out.println("bonjour");
                                }

                             //button switch
                              Scanner scanner4 =new Scanner(System.in);
                                int button1 = scanner4.nextInt();
                                switch (button) {
                                    case 1:
                                        System.out.println("hello");
                                        break;
                                    case 2:
                                        System.out.println("namaste");
                                        break;
                                    case 3:
                                        System.out.println("bonjour");
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}





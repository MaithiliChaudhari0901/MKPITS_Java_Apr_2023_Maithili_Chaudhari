import java.util.ArrayList;
import java.util.Arrays;
//program for printing the even and odd numbers in ArrayList
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        //Add numbers in arrayList by uding addAll method
        arrayList.addAll(Arrays.asList(34,65,87,67,45,24,43,28,85,64,39));
        //for printing the even numbers
        arrayList.forEach(number-> {
            if(number %2==0)
                System.out.println("Even numbers"+number);
        });
        //For printing the odd numbers
        arrayList.forEach(number-> {
            if(number %2!=0)
                System.out.println("odd numbers"+number);
    });
    }
}
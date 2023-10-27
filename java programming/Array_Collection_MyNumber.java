package Arr1;
import java.util.ArrayList;
import java.util.Collections;

public class Array1_Collection {
    public static void main(String[] args) {
            ArrayList<String> MyNumber= new ArrayList<String>();
            MyNumber.add("65");
            MyNumber.add("39");
            MyNumber.add("54");
            MyNumber.add("66");
            Collections.sort(MyNumber);
            for (String num:MyNumber)
                System.out.println(num);
            }
        }



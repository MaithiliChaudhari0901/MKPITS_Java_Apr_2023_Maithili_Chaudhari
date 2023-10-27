package Arr1;
import java.util.ArrayList;

public class Array1_Loop {
    public class Main {
        public static void main(String[] args) {
            ArrayList<String> MyNumber = new ArrayList<String>();
            MyNumber.add("56");
            MyNumber.add("60");
            MyNumber.add("30");
            MyNumber.add("45");
            for (int total= 0; total< MyNumber.size(); total++) {
                System.out.println(MyNumber.get(total));
            }
        }
    }


}

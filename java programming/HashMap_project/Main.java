
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");


        HashMap<Integer,Integer> hashMap= new HashMap <Integer,Integer>();

        hashMap.put(7,90);
        hashMap.put(9,89);
        hashMap.put(7,60);
        hashMap.put(5,50);
        hashMap.put(2,23);
        hashMap.put(9,97);
        hashMap.put(8,87);
        hashMap.put(7,67);
        hashMap.put(5,97);
        hashMap.put(3,37);
        hashMap.put(2,47);
        hashMap.put(4,57);
        hashMap.put(6,67);
        hashMap.put(2,67);
        hashMap.put(1,67);
        hashMap.put(9,67);
        hashMap.put(7,67);
        hashMap.put(5,67);
        hashMap.put(90,876);
        hashMap.put(67,433);
        hashMap.put(56,211);
        hashMap.put(45,544);
        hashMap.put(45,544);
        hashMap.put(45,544);
        hashMap.put(54,344);
        hashMap.put(43,766);

        TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>(hashMap);
        System.out.println(hashMap);
        System.out.println(treeMap);






    }
}



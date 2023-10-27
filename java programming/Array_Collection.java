package Arr;
import java.util.ArrayList;
import java.util.Collections;

public class Array_Collection {
    public static void main(String[] args) {
            ArrayList<String> Name = new ArrayList<String>();
            Name.add("Prisha");
            Name.add("Mahima");
            Name.add("Kirti");
            Name.add("Aarju");
            Collections.sort(Name);
            for (String i : Name) {
                System.out.println(i);
            }
        }
    }


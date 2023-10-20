package coll;
import java.util.*;
import java.util.HashMap;

public class Collection_hashMap1 {

    public static void main(String args[]) {
            // create two hash maps
            HashMap<Integer,String> hash_map_first = new HashMap <Integer,String> ();
            HashMap <Integer,String> hash_map_second = new HashMap <Integer,String> ();
            // populate hash maps

            hash_map_first.put(1, "Prajacta Mohod");
            hash_map_first.put(2, "Maithili Chaudhari");
            hash_map_first.put(3, "Yashshree Meshram");
            System.out.println("\nValues in first map: " + hash_map_first);
            hash_map_second.put(4, "Priya Matre");
            hash_map_second.put(5, "Aayushi Tale");
            hash_map_second.put(6, "Aanadi Chaudhari");
            System.out.println("\nValues in second map: " + hash_map_second);

            // put all values in second map
            hash_map_second.putAll(hash_map_first);
            System.out.println("\nNow values in second map: " + hash_map_second);
        }
    }





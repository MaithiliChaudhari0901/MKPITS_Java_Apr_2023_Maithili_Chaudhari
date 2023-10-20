package coll;
import java.util.*;
public class Collection_HashMap3 {

        public static void main(String args[]) {
            HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
            hash_map.put(1, "Manu Chaudhari");
            hash_map.put(2, "Shivani Patinge");
            hash_map.put(3, "Yashu Meshram");
            hash_map.put(4, "Priya Matre");
            hash_map.put(5, "Prajacta Mohod");
            // print the map
            System.out.println("The Original linked map: " + hash_map);
            // Removing all the elements from the linked map
            hash_map.clear();
            System.out.println("The New map: " + hash_map);
        }
    }


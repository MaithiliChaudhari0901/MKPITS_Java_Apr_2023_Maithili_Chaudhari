package coll;
import java.util.*;
public class Collction_Hash_Map4 {

        public static void main(String args[]) {

            HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
            hash_map.put(1, "Priya Matre");
            hash_map.put(2, "Prajkta Mohod");
            hash_map.put(3, "Shital Chaudhari");
            hash_map.put(4, "Manali Chaudhari");
            hash_map.put(5, "Yashu Meshram");

            // check if map is empty
            boolean result = hash_map.isEmpty();

            // check the result
            System.out.println("Is hash map empty: " + result);

            // Removing all the elements from the linked map
            hash_map.clear();

            // check if map is empty
            result = hash_map.isEmpty();

            // check the result
            System.out.println("Is hash map empty: " + result);
        }
    }



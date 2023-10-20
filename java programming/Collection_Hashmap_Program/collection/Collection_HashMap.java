package collection;
import java.util.*;
public class Collection_HashMap {

    public static void main(String args[]) {
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "sharda_Nagar");
        hash_map.put(2, "vijay_colony");
        hash_map.put(3, "parvati_Nagar");
        hash_map.put(4, "ravi_nagar");
        hash_map.put(5, "rathi_nagar");

            for(Map.Entry x:hash_map.entrySet()){
                System.out.println(x.getKey()+" "+x.getValue());
            }
        }
    }


package map;

import java.util.HashMap;
import java.util.Map;


public class MapExample {
    public static void main(String[] args){ 
       // create a object
     Map map=new HashMap();
       
       //inserting value-key pair jsonobject
       map.put("name", "maithili");
       map.put("id","10");
       map.put("city","chandur bazar");
       map.put("address","krishna colony");
       
       
       System.out.print(map);
    
}

   

    
}

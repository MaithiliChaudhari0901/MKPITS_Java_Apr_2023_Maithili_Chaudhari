
package obj;
import org.json.simple.JSONObject;


public class ObjectCreate {
    
  
public static void main(String args[]){  
    //create object
JSONObject jsonobject=new JSONObject();
//inserting value-key pair jsonobject
  jsonobject.put("name","maithili");    
  jsonobject.put("id", (27));    
  jsonobject.put("city","chandur bazar");
  jsonobject.put("address","krishna colony");
   System.out.print(jsonobject);    
    
}
}

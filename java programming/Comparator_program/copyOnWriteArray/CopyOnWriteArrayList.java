package copyOnWriteArray;
import java.util.ArrayList;
import java.util.List;

public class CopyOnWriteArrayList {
   public static void main(String[] args) {
       List list= new ArrayList<>();
       list.add(56);
       list.add(36);
       list.add(78);
       list.add(45);
       System.out.println(list.get(1));
       System.out.println(list.set(0,56));
       System.out.println(list.add(56));
       System.out.println(list.indexOf(78));
       System.out.println(list.hashCode());
       System.out.println(list.contains(45));
       System.out.println(list.iterator());
       System.out.println(list.stream());
       System.out.println(list.remove(2));

   }
}

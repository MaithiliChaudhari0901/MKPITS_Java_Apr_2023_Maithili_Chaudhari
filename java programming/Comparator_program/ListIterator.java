
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ListIterator {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(45);
        list.add(50);
        list.add(60);
        System.out.println("get method return object with the help of indexing"+list.get(1));
        System.out.println("contain method return true or false with the help of object"+list.contains(45));
        System.out.println(list.set(0,45));
        System.out.println(list.equals(45));
        System.out.println(list.hashCode());
        System.out.println(list.iterator());
        System.out.println(list.indexOf(50));
        System.out.println(list.add(45));
        System.out.println(list.remove(0));

    }


    }



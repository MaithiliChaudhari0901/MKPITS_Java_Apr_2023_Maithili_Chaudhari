import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //filter interface
        List<Integer>numbers=Arrays.asList(45,67,34,24);
        List list1=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list1);

        List<Integer>number=Arrays.asList(45,67,34,24);
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
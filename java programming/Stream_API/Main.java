
import java.util.*;
import java.util.stream.Collectors;
import java.util.List;


public class Main {
    public static void main (String[] args) {

        //map interface
        List<String>cities=Arrays.asList("Masod","Morshi","Amaravati","Chandurbazar","mumbai");
        cities.stream().map(c->c).forEach(System.out::println);

        List list=cities.stream().map(c->c).collect(Collectors.toList());
        System.out.println(list);


        //filter interface
        List<Integer>numbers=Arrays.asList(45,67,34,24);
        List list1=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list1);

        List<Integer>number=Arrays.asList(45,67,34,24);
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);

        //sorted interface
        List<String>city=Arrays.asList("Masod","Morshi","Chandurbazar","Amravati");
        cities.stream().sorted().forEach(System.out::println);
        List list2=cities.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);

        //reduce interface
         int sumOfNumbers=numbers.stream().reduce(0,(sum, n)->sum+n);
        System.out.println(sumOfNumbers);
        int sumOfEvenNumbers=numbers.stream().filter(n->n%2==0).reduce(0,(sum,n)->sum+n);
        System.out.println(sumOfEvenNumbers);
        






    }

}

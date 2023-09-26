 import java.util.*;
 import java.util.stream.Collectors;
 import java.util.stream.DoubleStream;
 import java.util.stream.Stream;

 import static java.util.Arrays.stream;

 public class Main {
         public static void main (String args[]) {

        //filtering
        List<String>cities=Arrays.asList("Morshi","Chandurbazar","Amaravati");
        cities.stream().filter(c->c.startsWith("A")).forEach(System.out::println);

        //collecting
        List list1=cities.stream().filter(c->c.startsWith("A")).collect(Collectors.toList());
        System.out.println(list1);

         //Mapping
             List<Integer>num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
             num.stream().map(n-> n*2).forEach(System.out::println);
             List doubleArrayListNumber=num.stream().map(n->n).collect(Collectors.toList());
             System.out.println("doubleArrayListNumbers");



             // Sort strings in ascending order
             List<String>city= Arrays.asList("Amaravati","Morshi","Aarvi","Wardha");
             System.out.println("Original List of strings(cities): " + cities);
             cities.stream().sorted().forEach(System.out::println);
             List<String>ascendingOrder=cities.stream().collect(Collectors.toList());
             System.out.println("ascendingOrder");


             //filter interface
             List<Integer> input = Arrays.asList(5, 3, 15, 9, 2, 5, 11);
             Stream<Integer> stream = input.stream().filter(number -> number >= 9);
             stream.forEach(number -> System.out.println("greater number"+number));



             //combining operator
     List<Integer>numbers=Arrays.asList(45,32,2,5,8,10);
     List list4=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
     System.out.println(list4);
     Integer list5= numbers.stream().filter(n -> n % 2 == 1).map(d -> d * 2).reduce(0, (sum, n) -> sum + n);
             System.out.println(list5);
             
    



         }

         }




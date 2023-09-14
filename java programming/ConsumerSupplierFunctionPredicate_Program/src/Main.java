import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String>cities=Arrays.asList("Wardha","Chandurbazar","Paratvada","Amravati","Morshi","Tivsa","lehgao");

        //Consumer Interface
        Consumer<List<String>> uppercaseConsumer= List -> {
            for(int number=0; number<List.size();number++){
                List.set(number,List.get(number).toUpperCase());
            }
        };
        Consumer<List<String>>printConsumer=list->list.stream().forEach(System.out::println);
        uppercaseConsumer.andThen(printConsumer).accept(cities);



        //Supplier Interface
        Supplier<Double>supplier=()-> {
            return Math.random();
        };
        System.out.println(supplier.get());



        //Predicate Interface
        Predicate<String>namesContainA=str-> str.contains("M");
        cities.stream().filter(namesContainA).forEach(c-> System.out.println(c));



        //Function Interface
        Function<String,Integer>nameMappingFunction=String::length;
        cities.stream().map(nameMappingFunction).forEach(c-> System.out.println(c));
    }
}
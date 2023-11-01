import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String>cities=Arrays.asList("Wardha","Nagpur","Pune","Mumbai");
        //Consumer Interface
        Consumer<List<String>> uppercaseConsumer= List -> {
            for(int i=0; i<List.size();i++){
                List.set(i,List.get(i).toUpperCase());
            }
        };
        Consumer<List<String>>printConsumer=list->list.stream().forEach(System.out::println);
        uppercaseConsumer.andThen(printConsumer).accept(cities);
    }
}
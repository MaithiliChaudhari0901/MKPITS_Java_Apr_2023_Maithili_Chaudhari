import java.util.*;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //sorted interface
        List<String>city=Arrays.asList("Masod","Morshi","Chandurbazar","Amravati");
        city.stream().sorted().forEach(System.out::println);
        List list2=city.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);

    }
}
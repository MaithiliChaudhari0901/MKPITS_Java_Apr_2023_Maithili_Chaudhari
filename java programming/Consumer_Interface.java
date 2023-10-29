package cons;

import java.util.function.Consumer;
public class ConsumerInterface {
    static void printMessage(String name){
        System.out.println("Hello "+name);
    }
    static void printValue(int val) {
        System.out.println(val);
    }
    public static void main(String[] args) {
        Consumer<String> consumer = ConsumerInterface::printMessage;
        consumer.accept("Herry"); // Calling Consumer method



        Consumer<Integer> consumer1 = ConsumerInterface::printValue;
        consumer1.accept(30);   // Calling Consumer method
    }
}

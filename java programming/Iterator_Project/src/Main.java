
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // create  collection
                ArrayList<String> name = new ArrayList<String>();
                name.add("Maithili");
                name.add("Manali");
                name.add("Sonali");
                name.add("Dipali");

                // Get the iterator
                Iterator<String> it = name.iterator();

                // Print the first item
                System.out.println(it.next());
            }
        }


import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Creae a list and add some colors to the list

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Nehal Singh");
        list_Strings.add("Jiya Kapoor");
        list_Strings.add("Anaya Roy");
        list_Strings.add("Ujwala Mohod");
        list_Strings.add("Prajacta Mohod");

                // Print the list
        System.out.println(list_Strings);

                // Retrive the first and third element
        String element = list_Strings.get(0);

        System.out.println("First element: "+element);

        element = list_Strings.get(2);

        System.out.println("Third element: "+element);
            }
        }

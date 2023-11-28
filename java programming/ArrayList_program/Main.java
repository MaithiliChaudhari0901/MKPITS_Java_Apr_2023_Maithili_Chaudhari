
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Creating a list

        List<String> list_Strings = new ArrayList<String>();

        list_Strings.add("manu");
        list_Strings.add("maithu");
        list_Strings.add("aanu");
        list_Strings.add("samu");
        list_Strings.add("Sanu");

        // Print the list
        System.out.println(list_Strings);
        list_Strings.add(0, "riya");
        list_Strings.add(5, "siya");

        // Print the list
        System.out.println(list_Strings);
    }
}
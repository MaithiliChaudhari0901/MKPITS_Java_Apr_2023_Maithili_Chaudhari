package stud;



import java.io.*;
import java.util.Scanner;

public class Longestword {
    public static void longestWords() throws IOException {
        BufferedReader read = new BufferedReader(new FileReader("xyz.txt"));
        String string = read.readLine();
        String str = "";
        while (string != null) {
            String[] string1 = string.split(" ");
            for (int number = 0; number < string1.length; number++) {
                if (string1[number].length() > str.length()) {
                    str = string1[number];
                }
            }
            string = read.readLine();
        }
        System.out.println(str);

    }
}





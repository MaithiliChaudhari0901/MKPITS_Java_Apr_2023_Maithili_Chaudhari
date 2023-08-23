import stud.Longestword;
import stud.ReadWriteObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new FileReader("xyz.txt"));
//
//        try {
//            String str = reader.readLine();
//            while (str != null) {
//                Longestword++;
//                for (String word:WordsInLine) {
//                    if(word.length()>longestWord.length()) {
//                        longestWord=word;
//                    }
//                    str = reader.readLine();
//            }
//            System.out.println(Longestword);
//            }
//            reader.close();
//
//        } catch (IOException e) {
//                throw new RuntimeException(e);
//            }

       Longestword longestword=new Longestword();
       longestword.longestWords();

        }
    }




import stud.ReadWriteObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    



    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("xyz.txt"));


        int char1= 0;

        int word = 0;

        int line = 0;

        try
        {


            String str = reader.readLine();

            while (str != null)
            {

                line++;



                String[] words = str.split(" ");



                word = word + words.length;



                for (String wordAll : words)
                {

                    char1 = char1 + wordAll.length();
                }


                str = reader.readLine();
            }



            System.out.println("Number Of Characters in a File : "+char1);

            System.out.println("Number Of Words in a  File : "+word);

            System.out.println("Number Of Lines in a File : "+line);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println(e);;
        }
    }
}
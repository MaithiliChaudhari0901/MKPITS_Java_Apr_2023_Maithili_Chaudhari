

import java.io.*;

public class FileReadWrite {
    public static void writeToFile(String fname) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));
        String choice;
        do {

            System.out.println("Enter the contents");
            String str = br.readLine();
            bw.write(str + "\n");
            System.out.println("Do you want another String(yes/no)");
            choice = br.readLine();
        }
        while (choice.equalsIgnoreCase("yes"));
        bw.close();
    }

    public static void longestWordFromFile(String fname ) throws IOException {
        String lines[] = new String[5];
        try {
            File file = new File(fname);
            while (str != null)
            {
                String[] words = str.split("");
                if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String st = br.readLine();
                for (String word:WordsInLine) {
                    if(word.length()>longestWord.length()) {
                        longestWord=word;
                    }
                }
                Line=bufferedreader.readLine();
            System.out.println(longestword);
            } else System.out.println("not null");
        }
            catch (IOException e) {
            throw  new RuntimeException(e);







package stud;

import java.io.*;

public class ReadWriteObject {
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
        } while (choice.equalsIgnoreCase("yes"));
        bw.close();
    }

    public static void readFromFile(String files) throws IOException {
        String lines[] = new String[8];
        try {
            File file = new File(files);
            int i = 0;
            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String st = br.readLine();
                while (st == String.valueOf(i)) {
                    st = br.readLine();
                    i++;

                }
                for (i = 0; i < lines.length; i++) {
                    System.out.println(lines[i]);
                }
            } else System.out.println("not null");
        } catch (IOException e) {
            System.out.println(e);


        }

    }

}
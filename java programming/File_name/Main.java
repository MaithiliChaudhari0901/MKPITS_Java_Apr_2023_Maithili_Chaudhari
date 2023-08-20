import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the source file name");

        String fname1 = null;
        try {
            fname1 = br.readLine();


        File file = new File(fname1);
        if (file.exists()) {

            System.out.println("Enter the target file name");
            String fname2 = br.readLine();
            Filecopy.filecopy(fname1, fname2);
        } else
            System.out.println("file does not exist");
    }catch(Exception e){

        System.out.println(e);
    }
}
}




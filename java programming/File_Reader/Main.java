import java.io.File;

public class Main {
    public static void main(String[] args) {
     File f=new File("Main.java");
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        File ff=new File("c:\\","Main.java");
        System.out.println(ff.exists());
        File d=new File("c:\\");
        System.out.println(d.exists());
        String[] files= d.list();
        for(String fn:files) {
            System.out.println(fn);


        }
        System.out.println(ff.isFile());
        System.out.println(ff.canRead());
        System.out.println(ff.getPath());
        System.out.println(ff.isDirectory());
        System.out.println(d.isFile());
        System.out.println(d.isDirectory());
        System.out.println(d.canExecute());
        System.out.println(d.getPath());
        System.out.println(d.canRead());
        System.out.println(ff.canWrite());
        System.out.println(d.canWrite());
        System.out.println(d.getName());
        System.out.println(ff.getAbsolutePath());
       System.out.println(d.length());
       System.out.println(ff.length());
       System.out.println(d.mkdir());
       System.out.println(ff.mkdir());

    }



}
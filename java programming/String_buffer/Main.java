import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Amaravati");
        sb.append("Masod");
        System.out.println(sb);
        sb.insert(6, " ");

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String st=new String(sc.next());
        StringBuffer ab1= new StringBuffer(st);
        ab1.reverse();
        if(st.equals("ab1.toString"))
            System.out.println("p");
        new StringBuffer("ab1.equals");
    }
}
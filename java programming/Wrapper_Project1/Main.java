public class Main {
    public static void main(String[] args) {
        int i=20;
        long m=10;
        char x='m';


//Autoboxing: Converting primitives into objects

                Integer intobj=i;
                Long longobj=m;
                Character charobj=x;


//Printing objects

        System.out.println("Integer object: "+intobj);
        System.out.println("Long object: "+longobj);
        System.out.println("Character object: "+charobj);


//Unboxing: Converting Objects to Primitives
        int intvalue=intobj;
        long longvalue=longobj;
        char charvalue=charobj;


//Printing primitives

        System.out.println("int value: "+intvalue);
        System.out.println("long value: "+longvalue);
        System.out.println("char value: "+charvalue);
    }
}




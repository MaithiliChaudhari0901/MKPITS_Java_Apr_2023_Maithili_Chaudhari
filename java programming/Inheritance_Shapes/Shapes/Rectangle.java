package Shapes;
public class   Rectangle extends Shape  {
 private double length;
 private double breadth;


    public  Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;

    }

    public void area (){
        double area =length*breadth;
        System.out.println("area of rectangle is "+area);



    }
}

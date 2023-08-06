package Shapes;

public class Square  extends Shape {
   private double side;



public Square (int side){
        this.side=side;


    }
    public void area (){
        double area =side*side;
        System.out.println("area of square is "+area);



    }
}
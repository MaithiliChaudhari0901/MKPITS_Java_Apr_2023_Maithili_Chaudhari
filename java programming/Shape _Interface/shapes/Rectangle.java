package shapes;


public class  Rectangle implements Shape {

      private int  length;
      private int breadth;
    public  Rectangle (int length,int breadth){
        this.length=length;
        this.breadth=breadth;

    }

    public void area (){
        double area =length*breadth;
        System.out.println("area of rectangle is "+area);



    }
}





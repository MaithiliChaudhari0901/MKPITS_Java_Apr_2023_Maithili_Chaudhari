class TriangleMethodOverlaoding1{
public int triangle(int base ,int height){
return base*height/2;
}
public double triangle(double base ,double height){
return base*height/2;
}
public static void main(String[] args){
TriangleMethodOverlaoding1 areaoftriangle =new TriangleMethodOverlaoding1();

int Areaoftriangle1=areaoftriangle.triangle(6,4);
System.out.println("Area of Triangle=" +Areaoftriangle1);

double Second =areaoftriangle.triangle(14.5,10.8);
System.out.println("Area of Triangle=" +Second);
}
}
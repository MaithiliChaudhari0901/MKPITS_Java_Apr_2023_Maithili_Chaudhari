class DivisionNoArguReturntype {

public int division () {
int number1=3,number2=5;
return number1/number2;

}
public static void main(String[] args) {
DivisionNoArguReturntype add= new DivisionNoArguReturntype();
int div=add.division();
System.out.println("division of two number="+div);
}
}
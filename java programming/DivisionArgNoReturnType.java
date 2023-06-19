//-----Argument with no returntype------

class DivisionArguNoReturnType {

public void division(int number1,int number2){
int div;
div=number1/number2;
System.out.println("division of two number= "+div);
}
public static void main(String[] args){
DivisionArguNoReturnType add=new DivisionArguNoReturnType();
add.division(20,5);
}
}
//-----Argument with no returntype------

class MultiplicationArgNoReturnType{

public void multiplication(int number1,int number2){
int multiple;
multiple=number1*number2;
System.out.println("Multiplication of two number= "+multiple);
}
public static void main(string[]args){
MultiplicationArgNoReturnType mul=new MultiplicationArgNoReturnType();
mul.multiplication();
}
}
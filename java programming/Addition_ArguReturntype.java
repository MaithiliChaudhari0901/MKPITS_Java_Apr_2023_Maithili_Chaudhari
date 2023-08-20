
class AdditionArguReturntype {
public int addition (int number1, int number2) {
return number1+number2;

}
public static void main(String[] args) {
AdditionArguReturntype add= new AdditionArguReturntype();
int sum=add.addition(4,6);
System.out.println("addition of two number"+sum);
}
}
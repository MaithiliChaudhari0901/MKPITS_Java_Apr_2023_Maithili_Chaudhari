class AdditionArguNoReturntype {
public void addition (int number1, int number2) {
int sum;
sum=number1+number2;
System.out.println("Addition of two number"+sum);
}
public static void main(String[] args) {
AdditionArguNoReturntype add= new AdditionArguNoReturntype();
add.addition(4,6);
}
}
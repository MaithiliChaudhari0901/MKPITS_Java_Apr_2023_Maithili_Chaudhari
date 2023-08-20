class SubstractionArguNoReturntype {
public void substract (int number1, int number2) {
int sub;
sub=number1-number2;
System.out.println("Substraction of two number"+sub);
}
public static void main(String[] args) {
SubstractionArguNoReturntype add= new SubstractionArguNoReturntype();
add.substract(4,6);
}
}
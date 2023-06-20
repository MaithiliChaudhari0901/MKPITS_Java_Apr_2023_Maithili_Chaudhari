class MultiplicationArguNoReturntype {
public void multiply (int number1, int number2) {
int mul;
mul=number1*number2;
System.out.println("Multiplication of two number"+mul);
}
public static void main(String[] args) {
MultiplicationArguNoReturntype add= new MultiplicationArguNoReturntype();
add.multiply(4,6);
}
}
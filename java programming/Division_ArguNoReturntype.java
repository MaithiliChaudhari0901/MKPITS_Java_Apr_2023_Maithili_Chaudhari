class DivisionArguNoReturntype {
public void divide (int number1, int number2) {
int div;
div=number1/number2;
System.out.println("Division of two number"+div);
}
public static void main(String[] args) {
DivisionArguNoReturntype add= new DivisionArguNoReturntype();
add.divide(4,6);
}
}
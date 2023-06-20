class AdditionNoArguReturntype {
public int addition () {
int number1=3,number2=5;
return number1+number2;

}
public static void main(String[] args) {
AdditionNoArguReturntype add= new AdditionNoArguReturntype();
int sum=add.addition();
System.out.println("addition of two number="+sum);
}
}
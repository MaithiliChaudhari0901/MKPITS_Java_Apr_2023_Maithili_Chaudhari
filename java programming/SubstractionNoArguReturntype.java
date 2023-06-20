class SubstractionNoArguReturntype {
public int substraction () {
int number1=3,number2=5;
return number1-number2;

}
public static void main(String[] args) {
SubstractionNoArguReturntype add= new SubstractionNoArguReturntype();
int sub=add.substraction();
System.out.println("substraction of two number="+sub);
}
}
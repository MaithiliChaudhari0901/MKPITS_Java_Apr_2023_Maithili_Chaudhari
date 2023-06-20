class MultiplicationNoArguReturntype {
public int multiplication () {
int number1=3,number2=5;
return number1*number2;

}
public static void main(String[] args) {
MultiplicationNoArguReturntype add= new MultiplicationNoArguReturntype();
int mul=add.multiplication();
System.out.println("multiplication of two number="+mul);
}
}
class Addition{
	
	//--------------Normal program-----------------
//public static void main(String[] args){
 // int a=5, b=6,c;
 // c=a+b;
 // System.out.println(c);
 
 //----------Addition by using Object---------------
 
 //-------Argument with no returntype-----------
 public void addition(int number1,int number2){
	 int sum;
	 sum=number1+number2;
	 System.out.println("Addition of 2-numbers = "+sum);
 }

//-------Argument with returntype-----------
 public int addition1(int number3,int number4){
	 return number3+number4;
 }
 
 //-------No Argument with returntype-----------
 public int addition2(){
	 int number5=3,number6=9;
	 return number5+number6;
 }
 
  //-------No Argument with No returntype-----------
 public void addition3(){
	 int number7=3,number8=9,sum3;
	 sum3= number7+number8;
	 System.out.println("Addition of 2-numbers = "+sum3);

	 
 }
 
 public static void main(String[] args){
	 Addition add=new Addition();
	 add.addition(5,6);
	 
	 int sum1=add.addition1(8,6);
	 System.out.println("Addition of 2-numbers = "+sum1);
	 
	 int sum2=add.addition2();
	 System.out.println("Addition of 2-numbers = "+sum2);
	 
	 add.addition3();

 }
 
}

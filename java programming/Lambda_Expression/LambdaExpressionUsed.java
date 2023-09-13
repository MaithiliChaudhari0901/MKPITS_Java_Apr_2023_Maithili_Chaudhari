public class LambdaExpressionUsed {
    interface Square {
    public void square();
}
        public static void main(String[] args) {
            int value=6;
            // lambda expression,Square implementation using anonymous inner class//
            Square sq=()->{
                System.out.println("Square"+value);
            };
            sq.square();  //calling the method//

        }

    }




import ln.*;
public class Main {
    public static void main(String[] args) {
        Loan myLoan=new Loan( "2331", 4000, 8);
        InterestCalculation ic=new InterestCalculation();
        ic.calculateInterest(myLoan.getAmt(),myLoan.getDuration());

    }
}
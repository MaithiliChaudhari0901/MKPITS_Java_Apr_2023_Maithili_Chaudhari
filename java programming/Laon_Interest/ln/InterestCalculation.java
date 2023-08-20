package ln;

public final  class InterestCalculation {
    private final int rateOfInterest;
    public InterestCalculation() {
        rateOfInterest=8;
    }
    public final void calculateInterest(double amount, int duration){
        System.out.println("Interest="+(amount+duration));


    }

}

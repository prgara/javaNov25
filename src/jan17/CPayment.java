package jan17;

public final class CPayment implements IPayment{


   final int chanrges = 10;


    @Override
    public void pay() {
        System.out.println("Pay using credit card");
    }

    @Override
    public void printDetails() {
        System.out.println("Receipt printed");
    }
}

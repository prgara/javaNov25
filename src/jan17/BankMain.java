package jan17;

import jan13.*;


public class BankMain {

    static void main() {
        BankOFCanada bank = new TdBank();
        System.out.println(bank.calculateInterest());


        Employee emp = new FullTimeEmployee(121,"Tom");


        CPayment pay = new CPayment();
        pay.pay();
        pay.printDetails();

    }
}

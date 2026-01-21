package jan17;

public class TdBank extends BankOFCanada{


    TdBank(){;
    }

    @Override
    double calculateInterest() {
        return primeRate +.99;
    }
}

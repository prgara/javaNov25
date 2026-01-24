package jan24;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    double getBalance(){
        return balance;
    }

    double withdraw(double amount){
        if(amount > balance){
           // System.out.println("Insuccfient fund");
           throw new InsufficientBalException("Balance is low");
        }
        balance = balance - amount;
        return balance;
    }

    double deposit(double amount){
         balance = balance + amount;
        return balance;
    }


}

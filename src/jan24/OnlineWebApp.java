package jan24;

public class OnlineWebApp {

    void register() throws InvalidEmailException{
       throw new InvalidEmailException("Email is not valid");
    }

    void emailConfirmation() throws InvalidEmailException{
        register();
        System.out.println("User email confirmed");
    }

    void login()throws InvalidEmailException {
        emailConfirmation();
        System.out.println("User logged in");
    }

    void shop() throws InvalidEmailException{
        login();
        System.out.println("Shopping done");
    }

    void payment() throws InvalidEmailException {
        shop();
        System.out.println("Payment done");
    }




}

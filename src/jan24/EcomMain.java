package jan24;

public class EcomMain {

    static void main(String[] args) {
        OnlineWebApp webapp = new OnlineWebApp();

        try {
            webapp.payment();
        }catch (InvalidEmailException e){
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}

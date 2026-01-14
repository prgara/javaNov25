package jan13;

public class Login {

   private String username;
   private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }



    void userLogin(String username, String password){
        if(username.equalsIgnoreCase(this.username) && password.equalsIgnoreCase(this.password)){
            System.out.println("You are logged in");
        } else {
            System.out.println("Please try with correct user name and password");
        }
    }
}




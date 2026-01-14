package jan13;

public class StudentMain {

    static void main() {
        Student student = new Student("Tom",123);


        Login login = new Login("harry", "Harry");

        login.setPassword("12345");

        login.userLogin("harry","12345");

        System.out.println(login.getUsername());


    }
}

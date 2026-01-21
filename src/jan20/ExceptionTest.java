package jan20;

import java.util.Scanner;

public class ExceptionTest {

    static void main() {
        System.out.println("Enter first num : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println("Enter sec num : ");
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();

        try {
            System.out.println(i / x);
            String s = null;
            s.getBytes();
        }
        catch (ArithmeticException e){
//            e.printStackTrace();
            System.out.println("we encountered a arithmetic exception");
        } catch (NullPointerException e){
            System.out.println("we encountered a null pointer exception");
        }
        catch (Exception e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("In the end");

    }

    //custom
}

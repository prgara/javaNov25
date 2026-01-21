package jan17;

import java.lang.String;
import java.util.Scanner;

public class Pay1 implements IPayment, Notification{
    @Override
    public void pay() {
        System.out.println("Payment done");
    }

    @Override
    public void printDetails() {

    }

    @Override
    public void sendNotification() {
        System.out.println("Notification sent");
    }


    static void main() {
        int x = 10;
        Integer a = x;      // Autoboxing
        int z = a; // unboxing

        int i = Integer.parseInt("100");
        Integer i1 = Integer.valueOf("100");
        String abcf = "ansj";
        Scanner sc = new Scanner(System.in);

    }
}

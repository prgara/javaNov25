package dec09;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Please enter the num you want factorial for ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int num = 1;
        for (int i = 1; i <=input; i++) {
            num = num*i;  //
        }//1*1 =1
        System.out.println(num);
    }
}

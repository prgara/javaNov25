package dec09;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the num : ");
        int input = scanner.nextInt();

        int sum =0;
  // 123 - 123/10 -> 12
        do {
            sum = sum +input %10;
            input = input/10;
        } while (input >0);
        System.out.println(sum);
    }
}

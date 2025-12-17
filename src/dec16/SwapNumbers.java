package dec16;

public class SwapNumbers {

    public static void main(String[] args) {
        // Swap 2 numbers
        int x = 100;
        int y = 200;


        System.out.println("before swapping");
        System.out.println("Value of x is : "+ x);
        System.out.println("Value of y is : "+ y);

        int temp = x;
        x = y;
        y = temp;


        System.out.println("After swapping");
        System.out.println("Value of x is : "+ x);
        System.out.println("Value of y is : "+ y);
    }
}

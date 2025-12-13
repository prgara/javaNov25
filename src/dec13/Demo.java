package dec13;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int x = 1;
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;

        int[] arr = {1,2,3,4,5,6,7,8,9,10};// -> first way

//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        for (int element : arr){
//            System.out.println(element);
//        }

        int[] array = new int[3]; // -> second way
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]  = sc.nextInt();

        }


        for (int ele : array){
            System.out.println(ele);
        }




    }
}

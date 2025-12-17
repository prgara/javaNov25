package dec16;

import java.util.Arrays;

public class ShiftArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        // {10,9,8,7,6,5,4,3,2,1}

//        for (int i = arr.length -1 ; i >=0  ; i--) {
//            System.out.println(arr[i]);
//        }

        int start = 0;
        int end = arr.length-1;
        int count = 0;

//        while(start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end --;
//        }

        for (int i = 0; i < arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1 -i] = temp;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Count is : " + count);

    }
}

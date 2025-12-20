package dec20;

public class MultiDimessionalArray {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};




        int[][] multiDimensionArr = {{67,54,63},{56,78,93},{35,56,78}};


        int[][] arr2 = new int [3][3];
        arr2[0][0] =6;
        arr2[0][1] =7;
        arr2[0][2] =8;
        arr2[1][0] =6;
        arr2[1][1] =6;
        arr2[1][2] =6;
        arr2[2][0] =6;
        arr2[2][1] =6;
        arr2[2][2] =6;

        for (int i = 0; i < arr2.length; i++) {  // i =0
            for (int j = 0; j <arr2[i].length ; j++) {  // j=0
            System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }

// WAP to use scanner to create 2D array and then loop over it and create a matrix

    }
}

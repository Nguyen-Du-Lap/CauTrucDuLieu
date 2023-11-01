package algorithm;

import java.util.Arrays;

public class MoveZeros {
    public static int[] moveZeros(int[] arr ) {
        int k = 0;
//        int[] T = new int[arr.length];
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == 0) {
                arr[k] = arr[i+1];
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 3, 0, 2, 0};

        System.out.println(Arrays.toString(moveZeros(arr)));
    }
}

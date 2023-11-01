package sorts;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int em = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = em;
                }
            }
            System.out.println("loop "+i+": "+ Arrays.toString(arr));
        }

        return arr;
    }
    public int[] sortNangCao(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean isBoolean = true;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    isBoolean = false;
                    int em = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = em;
                }
            }
            System.out.println("loop "+i+": "+ Arrays.toString(arr));
            if(isBoolean) break;
        }

        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {5, 3, 2, 7, 8, 1, 2};
        System.out.println(Arrays.toString(bubbleSort.sort(arr)));
    }
}

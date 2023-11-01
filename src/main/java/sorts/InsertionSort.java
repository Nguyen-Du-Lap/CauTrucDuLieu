package sorts;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j = i;
            while( j > 0 && arr[j] <= arr[j - 1]) {
                int en = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = en;

                j--;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {5, 3, 2, 7, 8, 1, 2};
        System.out.println(Arrays.toString(insertionSort.sort(arr)));
    }
}

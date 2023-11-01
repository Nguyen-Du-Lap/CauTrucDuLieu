package sorts;

import java.util.Arrays;

public class SelectionSort {
    public int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int i_min = i;
            int v_min = arr[i];
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < v_min) {
                    i_min = j;
                    v_min = arr[j];
                }
            }
            if(i_min != i) {
                arr[i_min] = arr[i];
                arr[i] = v_min;
            }
            System.out.println("loop "+i+": "+ Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {5, 3, 2, 7, 8, 1, 2};
        System.out.println(Arrays.toString(selectionSort.sort(arr)));
    }
}

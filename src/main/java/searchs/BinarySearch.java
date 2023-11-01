package searchs;

import sorts.InsertionSort;

import java.util.Arrays;

public class BinarySearch {
    public int search(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
           int mid = (left + right) / 2;
           if(arr[mid] == k) {
               return mid;
           }
           else if(arr[mid] < k) {
               left = mid + 1;
           }else {
               right = mid - 1;
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        InsertionSort insertionSort = new InsertionSort();
        int[] arrT = {5, 3, 2, 7, 8, 1, 2};
        int[] arr = insertionSort.sort(arrT);
        int k = 6;
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch.search(arr, k));
    }
}

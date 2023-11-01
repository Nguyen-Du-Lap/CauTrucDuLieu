package sorts;

import java.util.Arrays;

public class MyMergeSort {
    public int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0; int i1 = 0; int i2 = 0;
        while (i < n) {
            if(i1 < a1.length && i2 < a2.length) { // a1,a2 khong rong
                if(a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++; i1++;
                }else {
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }else {// a1 hoặc a2 rong
                if(i1 < a1.length) { // i1 ok
                    result[i] = a1[i1];
                    i++; i1++;
                }else { // i2 ok
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }
    public int[] mergeSort(int a[], int L, int R) {
        if(L == R) {
            int[] singleElement = {a[L]};
        return singleElement;
        }

        // THTQ

        //Chia ra
        System.out.println("Chia: "+L+" - "+ R);
        int k = (L+R)/2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k+1, R);

        // sắp xếp gộp vào
        int[] result = merge(a1, a2);

        return result;
    }

    public int[] mySort(int[] a) {
        return mergeSort(a, 0, a.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,5,4,2,4,9,7,6,3};
        MyMergeSort myMergeSort = new MyMergeSort();
        System.out.println(Arrays.toString(myMergeSort.mySort(arr)));
    }
}

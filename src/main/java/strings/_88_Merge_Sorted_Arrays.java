package strings;

import java.util.Arrays;

public class _88_Merge_Sorted_Arrays {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        for(int ai : n2) {
            insertAiAtArray(ai, n1, m);
            m++;
        }
    }

    public static void insertAiAtArray(int ai, int[] n1, int m) {
        int index = 0;
        while (index < m) {
            if(n1[index] > ai) break;
            index++;
        }
        for(int i = m; i > index; i--) {
            n1[i] = n1[i-1];
        }
        n1[index] = ai;
    }

    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        merge(n1, 3, n2, 3);
        System.out.println(Arrays.toString(n1));
    }
}

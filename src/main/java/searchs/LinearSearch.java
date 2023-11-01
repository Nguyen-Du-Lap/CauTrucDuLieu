package searchs;

public class LinearSearch {
    public int search(int[] arr, int k) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == k) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {5, 3, 2, 7, 8, 1, 2};
        int k = 8;
        System.out.println(linearSearch.search(arr, k));
    }
}

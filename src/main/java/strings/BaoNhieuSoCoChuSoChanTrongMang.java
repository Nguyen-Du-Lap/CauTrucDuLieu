package strings;

public class BaoNhieuSoCoChuSoChanTrongMang {
    public static int quantity(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            int s = count(arr[i]);
            if(s % 2 == 0) count++;
        }
        return count;
    }

    private static int count(int i) {
        int count = 1;
        while(i >= 10) {
            i = i/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 42323, 234, 24, 1234};
        System.out.println(quantity(arr));
    }
}

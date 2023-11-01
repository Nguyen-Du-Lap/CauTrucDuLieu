package algorithm;

public class TimDayConCoTongLonNhat {
    public void timDayConCoTongLonNhat(int[] arr) {
        int max = arr[0];
        int left = 0;
        int right = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int tong = tongCuaDay(arr, i, j);
                if(max < tong) {
                    max = tong;
                    left = i;
                    right = j;
                }
            }
        }
        System.out.println("Day chuoi tu "+ left +" den "+ right);
        System.out.println("Tong lon nhat là: "+ max);

    }

    private int tongCuaDay(int[] arr, int batdau, int ketthuc) {
        int sum = 0;
        for(; batdau <= ketthuc; batdau++) {
            sum += arr[batdau];
        }
        return sum;
    }

    public static void main(String[] args) {
        TimDayConCoTongLonNhat t = new TimDayConCoTongLonNhat();
        int[] arr = {1, 3, -5, 2, 3, 4, -1, 0};
        t.timDayConCoTongLonNhat(arr);
    }
}

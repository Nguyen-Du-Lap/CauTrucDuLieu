package algorithm;

public class TimDayConKhongGiamDaiNhat {
    public void timDayConKhongGiamDaiNhat(int[] arr) {
        int lengMax = 0;
        int i_max = 0;
        for(int i = 0; i < arr.length; i++) {
            int j = i;
            int leng = 1;
            while(j < arr.length - 1 && arr[j] <= arr[j+1]) {
                leng++;
                j++;
            }
            if(lengMax < leng) {
                lengMax = leng;
                i_max = i;
            }
        }
        System.out.println("Do dai max: "+ lengMax);
        System.out.println("bat dau tu vi tri: "+ i_max);
    }

    public static void main(String[] args) {
        TimDayConKhongGiamDaiNhat t = new TimDayConKhongGiamDaiNhat();
        int[] arr = {1, 0, 3, 7, 2, 9, 1};
        t.timDayConKhongGiamDaiNhat(arr);
    }
}

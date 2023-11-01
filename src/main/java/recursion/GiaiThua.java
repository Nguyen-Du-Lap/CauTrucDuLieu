package recursion;

public class GiaiThua {
    public static int giaiThua(int n) {
        if (n == 0) return 0;
        int t = n * giaiThua(n - 1);
        return t;
    }

    public static int fibonacci(int n) {
        System.out.println("F[" + n + "]");
        if (n <= 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Đệ quy có nhớ, Tối ưu đệ quy
    static int[] F = new int[1000];
    public static int fibonacci2(int n) {
        if(F[n] != 0) return F[n];
        System.out.println("F[" + n + "]");
        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }

        F[n] = fibonacci2(n - 1) + fibonacci2(n - 2);
        return F[n];
    }
    static int[] Fi = new int[11];
    public static int fibonacci3(int n) {
        Fi[1] = 1;
        Fi[2] = 2;
        for (int i = 3; i < Fi.length; i++) {
            Fi[i] = Fi[i-1] + Fi[i-2];
        }
        return F[n];
    }


    public static void main(String[] args) {

//        System.out.println(giaiThua(4));

        System.out.println(fibonacci2(10));
        System.out.println(fibonacci3(10));


    }
}

package recursion;

public class DaoNguocChuoi {
    public String daoNguocChuoi(String text) {
        return reverse(text, text.length() - 1);
    }

    private String reverse(String text, int n) {
        if(n <= 0) return String.valueOf(text.charAt(n));
        String result = text.charAt(n) + reverse(text, n-1);
        return result;
    }

    String s = "";
    public void reverse2(String text, int n) {
        if(n >= 0) {
            s += String.valueOf(text.charAt(n));
            reverse2(text, n-1);
        }

    }
    public String daoNguocChuoi2(String text) {
        reverse2(text, text.length()-1);
        return s;
    }

    public static void main(String[] args) {
        String text ="ABCD";
        System.out.println(new DaoNguocChuoi().daoNguocChuoi(text));
        System.out.println(new DaoNguocChuoi().daoNguocChuoi2(text));
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        int n = 122;
        int num = n;
        int r = 0;
        System.out.println(p.palin(n, r, num));
    }

    public boolean palin(int n, int r, int num) {
        if (n == 0) {
            if (num == r) {
                return true;
            }
            return false;
        }
        r = r * 10 + n % 10;
        n /= 10;
        return palin(n, r, num);
    }
}

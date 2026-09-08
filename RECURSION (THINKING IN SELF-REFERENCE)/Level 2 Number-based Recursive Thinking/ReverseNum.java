public class ReverseNum {
    public static void main(String[] args) {
        ReverseNum rn = new ReverseNum();
        int n = 123;
        String r = "";
        System.out.println(rn.Reverse(n, r));
    }
    public String Reverse(int n,String r){
        if(n == 0){
            return r;
        }
        r += n % 10;
        n /= 10;
        return Reverse(n, r);
    }
}

public class Ncr {
    public static void main(String[] args) {
        int n = 4;
        int r = 2;
        Ncr nc = new Ncr();
        System.out.println(nc.Printncr(n, r));

    }
    public int  Printncr(int n,int r){
        if (r == 0 || r == n){
            return 1;
        }
        return Printncr(n - 1, r - 1) + Printncr(n-1 ,r);

    }
}

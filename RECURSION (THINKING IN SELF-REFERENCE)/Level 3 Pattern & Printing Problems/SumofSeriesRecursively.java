public class SumofSeriesRecursively {
    public static void main(String[] args) {
        int n = 1;
        int v = 0;
        Sum(n, v);
    }
    static void Sum(int n,int v){
        if(n == 6){
            return ;
        }
        int old = v;
        v +=n;
        System.out.println(old + "+"+n+"="+v);
        Sum(n+1, v);
    }
}

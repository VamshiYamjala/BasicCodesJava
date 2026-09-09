public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;
        int v = 0;
        Binary(n,v);
    }
    static void Binary(int n,int v){
        if(n == 0){
            return;
        }
        v = n % 2;
        n = n / 2;
        Binary(n, v);
        System.out.print(v);
    }
}

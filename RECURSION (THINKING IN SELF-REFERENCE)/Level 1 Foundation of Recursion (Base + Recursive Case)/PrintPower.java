public class PrintPower {
    public static void main(String[] args) {
        int x = 2;
        int pow = 5;
        int p = 1;
        PrintPower pp = new PrintPower();
        System.out.println(pp.power(1,pow,x,p));
    }
    public int power(int n,int pow,int x,int p){
        if(n == pow){
            p *= x;
            return p;
        }
        p *= x;
        return power(n + 1, pow, x,p);
    }
}

public class NumIncDec {
    public static void main(String[] args) {
        int n = 1;
        Num(n);
    }
    static void Num(int n){
        if(n == 6){
            return ;
        }
        System.out.print(n);
        System.out.println();
        Num(n+1);
        System.out.print(n);
        System.out.println();
    }
}

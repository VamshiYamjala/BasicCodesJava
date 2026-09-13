class PrintNum{
    public void PrintNum1ToN(int n){
        for(int i = 1;i<=n;i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i);
            }
        }
    }
}
public class PrintNum1ToNDivisibleBy3Andfive{
    public static void main(String[] args) {
        PrintNum pn = new PrintNum();
        int n = 20;
        pn.PrintNum1ToN(n);
    }
}
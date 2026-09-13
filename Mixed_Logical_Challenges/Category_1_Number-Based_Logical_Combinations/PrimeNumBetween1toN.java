class Prime{
    public void PrintPrime(int n){
        for(int i = 1;i<=n;i++){
            int num = i;
            int count = 0;
            for(int j = 1;j<=num;j++){
                if(num % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
}
public class PrimeNumBetween1toN {
    public static void main(String[] args) {
        Prime p = new Prime();
        int n = 20;
        p.PrintPrime(n);
    }
}

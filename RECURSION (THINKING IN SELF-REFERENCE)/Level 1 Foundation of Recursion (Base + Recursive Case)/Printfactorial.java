public class Printfactorial {
    public static void main(String[] args) {
        Printfactorial pf = new Printfactorial();
        int n = 5;
        int fact = 1;
        System.out.println(pf.fatorial(1, n, fact));
    }
    public int fatorial(int num,int n,int fact){
        if(num == n){
            fact *= num;
            return fact;
        }
        fact *= num;
        return fatorial(num + 1, n, fact);
    }
}

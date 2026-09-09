public class Gcd {
    public static void main(String[] args) {
        Gcd g = new Gcd();
        int a = 48;
        int b = 18;
        System.out.println( g.PrintGcd(a,b));
    }
    public int PrintGcd(int a,int b){
        if(b == 0){
            return a;
        }

        return PrintGcd(b, a%b);
    }
}

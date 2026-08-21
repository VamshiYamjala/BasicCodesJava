import java.util.*;
class Factorial{
    public void FactorialOfRange(int n){
        for(int i = 1;i<=n;i++){
            int fact = 1;
            for(int j = 1;j<=i;j++){
                fact *=j;
            }
            System.out.println(fact);
        }
    }
}
public class FactorialOfNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();
        System.out.println("enter the number n to range of number ");
        int n = sc.nextInt();
        f.FactorialOfRange(n);
        sc.close();
    }
}

import java.util.*;
class Arithmetic{
    public void PrintArithmeticProgression(int n,int a,int b){
        int arit = a;
        for(int i = 1;i<= n; i++){
            System.out.println(arit);
            arit +=b;
        }
    }
}
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic ar = new Arithmetic();
        System.out.println("enter the range n to print arithmetic tell the range");
        int n = sc.nextInt();
        System.out.println("enter the number a");
        int a = sc.nextInt();
        System.out.println("enter the number b that will be difference of each number");
        int b = sc.nextInt();
        ar.PrintArithmeticProgression(n, a, b);
        sc.close();
    }
}

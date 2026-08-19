import java.util.*;
class Geometric{
    public void PrintGeometricProgression(int n,int a,int r){
        int arit = a;
        for(int i = 1;i<= n; i++){
            System.out.println(arit);
            arit *=r;
        }
    }
}
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geometric ar = new Geometric();
        System.out.println("enter the range n to print arithmetic tell the range");
        int n = sc.nextInt();
        System.out.println("enter the number a");
        int a = sc.nextInt();
        System.out.println("enter the number r that will be difference of each number");
        int r = sc.nextInt();
        ar.PrintGeometricProgression(n, a, r);
        sc.close();
    }

}

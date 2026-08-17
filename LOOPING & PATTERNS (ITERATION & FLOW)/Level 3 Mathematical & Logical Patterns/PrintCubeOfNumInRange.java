import java.util.*;
class Cube{
    public void CubeOfNumInRange(int n){
           if(n<=0){
            System.out.println("can't cube the number less then equal to zero");
            return;
        }
        for(int i = 1; i <= n ; i++){
            int square = i*i*i;
            System.out.println(square);
        }
    }
}
public class PrintCubeOfNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cube c = new Cube();
        System.out.println("enter the n to square of numbers tell n");
        int n = sc.nextInt();
        c.CubeOfNumInRange(n);
        sc.close();
}
}

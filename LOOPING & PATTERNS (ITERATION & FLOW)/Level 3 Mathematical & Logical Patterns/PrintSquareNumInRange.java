import java.util.*;
class Square{
    public void SquaresInRange(int n){
        if(n<=0){
            System.out.println("can't square the number less then equal to zero");
            return;
        }
        for(int i = 1; i <= n ; i++){
            int square = i*i;
            System.out.println(square);
        }
    }
}
public class PrintSquareNumInRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square s = new Square();
        System.out.println("enter the n to square of numbers tell n");
        int n = sc.nextInt();
        s.SquaresInRange(n);
        sc.close();
    }
}
import java.util.*;
class Number{
    public void PerfectSquare(int num){
        if(num == 1 || num == 4 || num == 9 || num == 16 || num == 25 ||num == 36 || num == 49 || num == 64 || num == 81 || num == 100){
            System.out.println("yes it is a perfect square");
        }
        else{
            System.out.println("not a perfect square");
        }
    }
}
public class WheatherNumIsPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number n = new Number();
        System.out.println("enter the number ");
        int num = sc.nextInt();
        n.PerfectSquare(num);
        sc.close();
    }
}

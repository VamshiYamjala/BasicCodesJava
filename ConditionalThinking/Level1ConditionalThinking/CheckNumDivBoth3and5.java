import java.util.*;
class CheckNumDiv3and5{
    public void CheckNumDivby3and5(int num){
        if(num % 3 == 0 && num % 5 == 0 ){
            System.out.println("the number is divisible by both 3 and 5: ");
        }
        else{
            System.out.println("no the number is not divisible by one of them or both: ");
        }
    }
}

public class CheckNumDivBoth3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNumDiv3and5 cn = new CheckNumDiv3and5();
        System.out.print("enter the number to check wheather is divides by both 3 and 5: ");
        int num = sc.nextInt();
        cn.CheckNumDivby3and5(num);
        sc.close();
    }
}

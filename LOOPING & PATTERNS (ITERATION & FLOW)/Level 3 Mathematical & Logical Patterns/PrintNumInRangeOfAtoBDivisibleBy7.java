import java.util.*;
class CheckNumInRange{
    public void NumDivisibleBy7(int a , int b){
        for(int i = a ; i <= b;i++){
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
public class PrintNumInRangeOfAtoBDivisibleBy7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNumInRange cr = new CheckNumInRange();
        System.out.println("enter the start and end range to check the number in range divisible by 7 ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        cr.NumDivisibleBy7(a, b);
        sc.close();
    }
}
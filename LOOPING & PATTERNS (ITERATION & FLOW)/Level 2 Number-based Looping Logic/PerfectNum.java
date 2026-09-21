import java.util.*;
class CheckPerfect{
    public boolean PrintPerfectNum(int num){
        int originalNum = num;
        int sum = 0;
        if(num <= 0){
            return false;
        }
        for(int i = 1; i < num ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(originalNum == sum){
            return true;
        }
        else{
            return false;
        }
    }
}
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckPerfect cp = new CheckPerfect();
        System.out.println("enter number");
        System.out.println("enter the number to check whether it is perfect number or not");
        int num = sc.nextInt();
        System.out.println(cp.PrintPerfectNum(num));
        sc.close();
    }
}

import java.util.*;
class FindStrongNum{
    public void PrintStrongNum(int num){
        if(num <=0){
            System.out.println("the number is less then or equal to zero so enter the positive number ");
            return;
        }
        int originalNum = num;
        int remainder;
        int sum = 0;
        while(num > 0){
            int fact =1 ;
            remainder = num % 10;
            for(int i = remainder;i>=1;i--){
                fact*=i;
            }
            sum+=fact;
            num = num / 10;
        }
        if(originalNum == sum){
            System.out.println("it is a strong number"+sum);
        }
        else{
            System.out.println("not a strong number "+sum);
        }
    }
}
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindStrongNum fs = new FindStrongNum();
        System.out.println("enter the number to find the StrongNumber or not ");
        int num = sc.nextInt();
        fs.PrintStrongNum(num);
        sc.close();
    }
}

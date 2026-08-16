import java.util.*;
class CheckNums{
    public boolean CheckPalindrome(int num){
        int originalNum = num;
        if(num >=0 && num <=9){
            return true;
        }
        else if(num < 0){
            return false;
        }
        else{
            String ReverseNum = "";
            while(num > 0){
                int remainder = num % 10;
                ReverseNum += remainder;
                num /=10;
            }
            if(originalNum == Integer.valueOf(ReverseNum)){
                return true;
            }
            else{
                return false;
            }
        }
    } 
}
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNums cn = new CheckNums();
        System.out.println("enter the number to check whether it is palindrome or not");
        int num = sc.nextInt();
        System.out.println(cn.CheckPalindrome(num));
        sc.close();
    }
}

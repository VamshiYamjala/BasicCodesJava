import java.util.*;
class CheckNum{
    public int CountNumOfDigit(int num){
        int count = 0;
        if(num == 0){
            // System.out.println("The number of Digits are 1");
            return 1;
        }
        else{
            long tempnum = Math.abs((long) num);
            while(tempnum > 0){
                count++;
                tempnum = tempnum / 10;
            }
            // System.out.println("The number of Digits are "+count);
            return count;
        }
    }
}
public class CountNumberOfDigitsInNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNum cn = new CheckNum();
        System.out.println("enter the number to check number of digits in num");
        int num = sc.nextInt();
        cn.CountNumOfDigit(num);
        sc.close();
    }
}
import java.util.*;
class CheckArm{
    public boolean CheckArmstrongNum(int num){
        CheckNum cn = new CheckNum();
        double sum = 0;
        int originalNum = num;
        int exponent = cn.CountNumOfDigit(num);
        long tempNum = Math.abs((long)num);
        if(num == 0){
            return true;
        }
        else{
            while(tempNum > 0){
                long remainder = tempNum % 10;
                sum += Math.pow(remainder, exponent);
                tempNum /= 10;
            }
            if(originalNum == sum){
                return true;
            }
            else{
                return false;
            }

        }
    }
}
public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckArm ca = new CheckArm();
        System.out.println("enter the number to check whether it is armstrong or not");
        int num = sc.nextInt();
        System.out.println(ca.CheckArmstrongNum(num));
        sc.close();

    }
}

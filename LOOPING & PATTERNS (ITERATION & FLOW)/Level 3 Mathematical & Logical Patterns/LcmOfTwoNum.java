import java.util.*;
class Lcm{
    public void FindLcmOf2Num(int num1 , int num2){
        int remainder = 1;
        int greatestNum = num1 > num2 ? num1 : num2;
        while(remainder > 0){
            if((greatestNum % num1 == 0) && (greatestNum % num2 == 0)){
                remainder = 0;
            }
            else{
                greatestNum++;
            }
        }
        System.out.println(greatestNum);
    }
}
public class LcmOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lcm l = new Lcm();
        System.out.println("enter the num1 and num2 to find Lcm of them");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        l.FindLcmOf2Num(num1, num2);
        sc.close();
    }
}

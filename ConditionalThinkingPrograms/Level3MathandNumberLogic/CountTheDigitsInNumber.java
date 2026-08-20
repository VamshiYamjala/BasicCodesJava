import java.util.*;
class DigitCount{
    public void CountDigits(int num){
        if(num >= 0 && num <= 9){
            System.out.println("Single Digit");
        }
        else if(num > 9 && num <=99){
            System.out.println("Double Digit");
        }
        else if(num > 99){
            System.out.println("Multi Digit");
        }
        else{
            System.out.println("Invalid input ");
        }
    }
}
public class CountTheDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DigitCount dc = new DigitCount();
        System.out.println("enter the number to check whether it is single/Double/Multi Digit ");
        int num = sc.nextInt();
        dc.CountDigits(num);
        sc.close();
    }
    
}

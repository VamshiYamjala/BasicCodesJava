import java.util.*;
class CheckLargestNum{
    public void Check2Num(int num1 , int num2){
        if(num1 > num2){
            System.out.println("the first number is greater then second number "+num1);
        }
        else{
            System.out.println("the second number is greater then first number "+num2);
        }
    }
}
public class LargestOf2num {
    public static void main(String[] args) {
        CheckLargestNum cl = new CheckLargestNum();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 2 numbers to check which is larger among them: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        cl.Check2Num(num1, num2);
        sc.close();
    }
}

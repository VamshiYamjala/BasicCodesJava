import java.util.*;
class FindLargestOfThreeNum{
    public void CheckLargestOf3Num(int num1 ,int num2 , int num3){
        if(num1 > num2 && num1 > num3){
            System.out.println("the first number is greater then 2 and 3 : "+num1);
        }
        else if(num2 > num1 && num2 > num3){
             System.out.println("the second number is greater then 1 and 3 : "+num2);
        }
        else{
            System.out.println("the third number is greater then 2 and 3 : "+num3);
        }
    }
}
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindLargestOfThreeNum flt = new FindLargestOfThreeNum();
        System.out.println("enter the 3 numbers to find largest among them: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        flt.CheckLargestOf3Num(num1, num2, num3);
        sc.close();
    }
}

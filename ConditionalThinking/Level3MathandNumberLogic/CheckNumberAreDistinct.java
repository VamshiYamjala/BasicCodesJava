import java.util.*;
class CheckNumber{
    public void CheckDigitsInNumber(int number){
        int firstnumber = number / 100;
        int middlenumber = (number / 10 ) % 10;
        int lastnumber = number % 10;

        if(firstnumber == middlenumber || middlenumber == lastnumber || lastnumber == firstnumber){
            System.out.println("The digits in the Number are Not a Distinct number ");
        }
        else{
             System.out.println("The digits in the Number are  Distinct number ");
        }
    }
    public void MiddleDigitCheck(int num){
        int FirstNum = num / 100;
        int MiddleNum = (num / 10) % 10;
        int LastNum = num % 10;

        if(MiddleNum > FirstNum && MiddleNum > LastNum){
            System.out.println("The middle number is largest number : ");
        }
        else if(MiddleNum < FirstNum && MiddleNum < LastNum){
            System.out.println("The middle number is smallest number : ");
        }
        else{
            System.out.println("The number is not greatest or smallest it is middle number ");
        }
    }
}
public class CheckNumberAreDistinct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNumber cn = new CheckNumber();
        System.out.println("enter the number to check wheather all Digits in it are Distinct ");
        int number = sc.nextInt();
        cn.CheckDigitsInNumber(number);
        sc.close();
    }
}
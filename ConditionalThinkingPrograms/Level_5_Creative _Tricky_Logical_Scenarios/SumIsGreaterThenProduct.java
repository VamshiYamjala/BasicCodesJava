import java.util.*;
class FourDigitCheck{
    public void SumGreaterThenProduct(int num){
        int firstnum = num / 1000;
        int Secondnum = (num / 100)%10;
        int thirdnum = (num / 10)%10;
        int fouthnum = num % 10;
        if(num >=1 & num<=9){
            System.out.println("Sum and product are equal in the single digit number");
        }
        else{
            if(num>=10 && num <=99){
                if((thirdnum + fouthnum)>(thirdnum * fouthnum)){
                    System.out.println("yes sum of digits greater then product");
                }
                else{
                    System.out.println("no sum of digits is not greater then product");
                }
            }
            else if(num>=100 && num <=999){
                if((Secondnum + thirdnum + fouthnum)>(Secondnum *thirdnum * fouthnum)){
                    System.out.println("yes sum of digits greater then product");
                }
                else{
                    System.out.println("no sum of digits is not greater then product");
                }
            }
            else if(num>1000){
                if((firstnum + Secondnum + thirdnum + fouthnum)>(firstnum* Secondnum *thirdnum * fouthnum)){
                    System.out.println("yes sum of digits greater then product");
                }
                else{
                    System.out.println("no sum of digits is not greater then product");
                }
        }    }
    }
}
public class SumIsGreaterThenProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FourDigitCheck fu = new FourDigitCheck();
        System.out.println("enter a number");
        int num = sc.nextInt();
        fu.SumGreaterThenProduct(num);
        sc.close();
    }
}

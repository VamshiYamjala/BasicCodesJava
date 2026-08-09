import java.util.*;
class NumberCheck{
    public void CheckNumOddOrEvenOrBoth(int num1 , int num2){
        if(num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Both numbers are even numbers! ");
        }
        else if(num1 % 2 != 0 && num2 % 2 != 0){
            System.out.println("Both numbers are odd numbers! ");
        }
        else if(num1 % 2 == 0 && num2 % 2 != 0){
            System.out.println(" The First number is even and Second is Odd ");
        }
        else if(num1 % 2 != 0 && num2 % 2 == 0){
            System.out.println(" The Second number is even and First is Odd ");
        }
        else{
            System.out.println(" Invalid Number , check it once ");
        }
    }
}
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberCheck nc = new NumberCheck();
        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();
        nc.CheckNumOddOrEvenOrBoth(num1, num2);
        sc.close();
    }
}

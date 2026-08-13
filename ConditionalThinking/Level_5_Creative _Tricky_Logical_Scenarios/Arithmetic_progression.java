import java.util.*;
class ArithmethicCheck{
    public void CheckArithmethic(int num1 , int num2 ,int num3){
        if((num2 - num1) == (num3 - num2)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}
public class Arithmetic_progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmethicCheck ac = new ArithmethicCheck();
        System.out.println("enter the numbers in ascending order to get Arithmethic or not ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        ac.CheckArithmethic(num1, num2, num3);
        sc.close();
    }
}

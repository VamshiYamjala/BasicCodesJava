import java.util.*;
class CheckNumMultipleOrEndWith7{
    public void MultipleOrEnds7(int numbers){
        if(numbers % 10 == 7 || numbers % 10 == -7 || numbers % 7 == 0){
            System.out.println("Yes the number is Multiple of 7 or ends with 7");
        }
        else{
            System.out.println("No the number is not multiple of 7 and Doesn't ends with 7 ");
        }
    }
}
public class CheckWheatherNumMutipleOf7OrEndsWith7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNumMultipleOrEndWith7 cn = new CheckNumMultipleOrEndWith7();
        System.out.println("enter the number to check whether it ends with 7 or multiple of 7 ");
        int numbers = sc.nextInt();
        cn.MultipleOrEnds7(numbers);
        sc.close();
    }
}

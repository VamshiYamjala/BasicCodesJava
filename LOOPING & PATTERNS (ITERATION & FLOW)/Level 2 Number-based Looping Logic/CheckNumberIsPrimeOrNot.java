import java.util.*;
class CheckPrime{
    public boolean CheckNumPrimeOrNot(int num){
        if(num <=1){
            return false;
        }
        else if(num == 2){
            return true;
        }
        else if(num % 2 == 0){
            return false;
        }
        else{
            int count = 0;
            for(int i = 1 ; i <= num ; i ++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 2){
                return true;
            }
            else{
                return false;
            }
        }
    } 
}
public class CheckNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckPrime cp = new CheckPrime();
        System.out.println("enter the number to check whether it is prime or not");
        int num = sc.nextInt();
        System.out.println(cp.CheckNumPrimeOrNot(num));
        sc.close();
    }
}

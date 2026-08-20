import java.util.*;
class CheckData{
    public void CheckFizzOrBuzz(int num){
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(num % 3 == 0){
            System.out.println("Fizz");
        }
        else if(num % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("can't divisible by both");
        }
    }
}
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckData cd = new CheckData();
        System.out.println("enter the number to check whether it is fizz or buzz");
        int num = sc.nextInt();
        cd.CheckFizzOrBuzz(num);
        sc.close();
    }
}

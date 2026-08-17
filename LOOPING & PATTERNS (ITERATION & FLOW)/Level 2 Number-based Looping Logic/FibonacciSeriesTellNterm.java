import java.util.*;
class Fibonacci{
    public void FibonacciTellnterm(int num){
        if(num <=0){
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }
        if (num >= 1) {
            System.out.println(0);
        }
        
        if (num >= 2) {
            System.out.println(1);
        }
        int firstNum = 0;
        int secondNum = 1;
        while(num > 2){
            int nextNum = firstNum + secondNum;
            System.out.println(nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
            num--;
        }
    }
}
public class FibonacciSeriesTellNterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci fb = new Fibonacci();
        System.out.println("enter the number");
        int num = sc.nextInt();
        fb.FibonacciTellnterm(num);
        sc.close();
    }
}

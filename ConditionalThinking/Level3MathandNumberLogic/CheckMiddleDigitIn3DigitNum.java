import java.util.Scanner;

public class CheckMiddleDigitIn3DigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNumber cn = new CheckNumber();
        System.out.println("enter the number to check wheather Middle Digit is greater or smaller  ");
        int num = sc.nextInt();
        cn.MiddleDigitCheck(num);
        sc.close();
    }
}

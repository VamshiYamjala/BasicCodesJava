import java.util.Scanner;

public class SumOfFirstNOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the nth number  to get sum of Odd numbers  ");
        int num = sc.nextInt();
        pn.SumOfNOddNum(num);
        sc.close();
    }
}

import java.util.Scanner;

public class SumOfFirstNEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the nth number  to get sum of even numbers  ");
        int num = sc.nextInt();
        pn.SumOfNEvenNum(num);
        sc.close();
    }
}

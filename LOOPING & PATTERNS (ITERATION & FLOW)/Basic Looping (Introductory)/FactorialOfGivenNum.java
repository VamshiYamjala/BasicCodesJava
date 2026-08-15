import java.util.Scanner;

public class FactorialOfGivenNum {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the number to find factorial of the number  ");
        int num = sc.nextInt();
        pn.FactorialOfNum(num);
        sc.close();
    }
}

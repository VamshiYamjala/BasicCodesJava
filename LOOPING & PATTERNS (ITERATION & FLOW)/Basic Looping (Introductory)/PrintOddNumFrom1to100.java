import java.util.Scanner;

public class PrintOddNumFrom1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the start and end numbers ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        pn.OddNum(start, end);
        sc.close();
    }
}

import java.util.Scanner;

public class PrintNumReverse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the end and start numbers to print reverse ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        pn.ReverseNum(end, start);
        sc.close();
    }
}

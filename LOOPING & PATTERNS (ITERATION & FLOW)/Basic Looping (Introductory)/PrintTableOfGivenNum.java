import java.util.Scanner;

public class PrintTableOfGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the Table number ");
        int num = sc.nextInt();
        pn.PrintTable(num);
        sc.close();
    }
}

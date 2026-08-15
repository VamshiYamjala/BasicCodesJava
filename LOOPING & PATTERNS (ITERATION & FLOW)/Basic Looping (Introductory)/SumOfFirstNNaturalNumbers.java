import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the nth number of natural number to get sum of them ");
        int num = sc.nextInt();
        pn.SumOfNNaturalNum(num);
        sc.close();
    }
}

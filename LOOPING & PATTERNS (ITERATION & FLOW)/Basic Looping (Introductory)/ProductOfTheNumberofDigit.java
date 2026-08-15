import java.util.Scanner;

public class ProductOfTheNumberofDigit {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the number to find Product  of the Digit of the number  ");
        int num = sc.nextInt();
        pn.ProductOfNumDigit(num);
        sc.close();
    }
}

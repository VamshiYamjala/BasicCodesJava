import java.util.Scanner;

class FourDigit{
    public void DigitNumberCount(int number){
        int firstN = number / 1000;
        int lastNum = number % 10 ;
        if(firstN == lastNum){
            System.out.println("Yes the first and last number are equal : ");
        }
        else{
            System.out.println("No the numbers are not same : ");
        }
    }
}
public class FourDigitNumCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FourDigit fd = new FourDigit();
        System.out.println("Enter the 4 digit number ");
        int number = sc.nextInt();
        fd.DigitNumberCount(number);
        sc.close();
    }
}
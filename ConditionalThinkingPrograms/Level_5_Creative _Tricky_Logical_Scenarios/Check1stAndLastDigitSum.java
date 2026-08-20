import java.util.*;;
class Digit{
    public void Check1stAnd3rd(int num1){
        int firstD,lastD,middleD;
        firstD = num1 / 100;
        middleD = (num1 / 10)% 10;
        lastD = num1 % 10;
        if(firstD + lastD == middleD){
            System.out.println("yes the sum of first and last digit is the middle digit");
        }
        else{
            System.out.println("no the sum is not equal to 3rd num ");
        }
    }
}
public class Check1stAndLastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Digit d = new Digit();
        System.out.println("enter the 3 digit number");
        int num1 = sc.nextInt();
        d.Check1stAnd3rd(num1);
        sc.close();
    }
}

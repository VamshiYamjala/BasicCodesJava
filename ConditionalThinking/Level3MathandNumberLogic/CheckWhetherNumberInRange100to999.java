import java.util.*;
class CheckNumInRange{
    public void NumCheckInRange100to999(int num){
        if(num >=100 && num <= 999){
            System.out.println("Yes the number is in the range of 100 to 999");
        }
        else{
            System.out.println("out of range ");
        }
    }
}
public class CheckWhetherNumberInRange100to999{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNumInRange cr = new CheckNumInRange();
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        cr.NumCheckInRange100to999(num);
        sc.close();
    }
}
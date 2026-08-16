import java.util.*;
class PrintNum{
    public void ReverseNum(int num){
        int originalNum = num;
        long tempNum = Math.abs((long) num);
        String ReverseNum = "";
        if(num == 0){
            System.out.println("the reverse number of given number is 0");
        }
        else{
            
            while(tempNum > 0){
                long remainder = tempNum % 10;
                ReverseNum += remainder;
                tempNum /=10;
            }
            System.out.println("the reverse number of given number "+originalNum+" is "+ReverseNum);
        }

    }
}
public class PrintReverseOfAGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the number to print the number reverse");
        int num = sc.nextInt();
        pn.ReverseNum(num);
        sc.close();
    }
}

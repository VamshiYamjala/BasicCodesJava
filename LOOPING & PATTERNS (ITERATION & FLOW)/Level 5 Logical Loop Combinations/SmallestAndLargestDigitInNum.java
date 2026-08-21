import java.util.*;

class PrintNumSmallAndLarg {
    public void SmallAndLargestNum(int num) {
        int remainder;
        int smallest = 9;
        int largest = 0;
        int temp = num;
        while (temp > 0) {
            remainder = temp % 10;
            if (remainder < smallest) {
                smallest = remainder;
            }
            else if(remainder > largest){
                largest = remainder;
            }
            temp /= 10;
        }
        System.out.println("smallest number is "+smallest);
        System.out.println("largest num is "+largest);
    }
}

public class SmallestAndLargestDigitInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNumSmallAndLarg pn = new PrintNumSmallAndLarg();
        System.out.println("enter the number");
        int num = sc.nextInt();
        pn.SmallAndLargestNum(num);
        sc.close();
    }
}

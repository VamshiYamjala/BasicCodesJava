import java.util.*;
class Median{
    public void FindMedian(int num1 , int num2,int num3){
        if((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3) ){
            System.out.println("the median is number "+num1);
        }
        else if((num2 >= num1 && num2 <= num3) || (num2 <= num3 && num2 >= num1)){
            System.out.println("the median is number "+num2);
        }
        else{
            System.out.println("the median is number "+num3);
        }
    }
}
public class MedianValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Median m = new Median();
        System.out.println("enter the 3 numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        m.FindMedian(num1, num2, num3);
        sc.close();
    }
}

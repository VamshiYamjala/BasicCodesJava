import java.util.*;
class PositiveNegativeOrZero{
    public void Number(int num){
        if(num<0){
            System.out.println("the number is negative number: "+num);
        }
        else if(num > 0){
            System.out.println("the number is positive number: "+num);
        }
        else if(num == 0){
            System.out.println("the number is zero :"+num);
        }
        else{
            System.out.println("invalid input: ");
        }
    }
}

public class PrintPositiveNegativeOrZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PositiveNegativeOrZero ps = new PositiveNegativeOrZero();
        System.out.print("enter the number to check wheather it is positive negative or zero : ");
        int num = sc.nextInt();
        ps.Number(num);
        sc.close();
    }
}
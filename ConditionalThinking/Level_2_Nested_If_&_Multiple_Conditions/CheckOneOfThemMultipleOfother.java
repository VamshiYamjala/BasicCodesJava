import java.util.*;
class CheckNum{
    public void CheckTheNumMul(int num1 , int num2){
        if(num1 == 0 || num2 == 0){
            System.out.println("number can't be zero ");
        }
        else if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("yes the one of the number is multiple of other ");
        }
        else{
            System.out.println("no the number are not multiple of one other :");
        }
    }
}
public class CheckOneOfThemMultipleOfother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNum ce = new CheckNum();
        System.out.println("enter the 2 number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        ce.CheckTheNumMul(num1, num2);
        sc.close();
    }
}

import java.util.*;
class EvenOrOdd{
    public void CheckTheNum(int num){
        if(num % 2 == 0){
            System.out.println("the number is even and the number is :"+num);
        }
        else if (num % 2 != 0){
            System.out.println("the number is odd and the number is :"+num);
        }
        else{
            System.out.println("invaild number");
        }
    }
}

public class CheckNumEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to check even or odd: ");
        int num = sc.nextInt();
        EvenOrOdd eo = new EvenOrOdd();
        eo.CheckTheNum(num);
        sc.close();
    }
}

import java.util.*;
class Current{
public void CheckCurrentBill(int units){
    if(units > 0 && units <= 200){
        System.out.println("the bill amount is "+(units*3));
    }
    else if(units > 200 && units <= 350){
        System.out.println("the bill amount is "+(units*5));
    }
    else if(units > 350){
        System.out.println("the bill amount is "+(units*7));
    }
}
}
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Current cb = new Current();
        System.out.println("enter the units consumed");
        int units = sc.nextInt();
        cb.CheckCurrentBill(units);
        sc.close();
    }
}

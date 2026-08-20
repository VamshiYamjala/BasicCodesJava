import java.util.*;
class CheckMoneyDistribution{
    public void CheckWhetherItEvenlyBy2000And500And100(int amount){
        if(amount < 0){
            System.out.println("Invalid value: Amount must be greater than zero.");
        }
        else if(amount % 100 == 0){
            System.out.println("Yes, the amount can be evenly divided into currency notes.");
        }
        else{
            System.out.println("No, the amount cannot be evenly divided into currency notes");
        }

    }
}
public class CheckMoneyEvenlyDistrubuted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckMoneyDistribution ck = new CheckMoneyDistribution();
        System.out.println("enter the amount");
        int amount = sc.nextInt();
        ck.CheckWhetherItEvenlyBy2000And500And100(amount);
        sc.close();
    }
}

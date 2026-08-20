import java.util.*;
class Tax{
    public void TaxCheck(int age , float salary){
        if(age > 18 && salary > 500000.00f){
            System.out.println("eligible for tax");
        }
        else{
            System.out.println("not eligible for tax");
        }
    }
}
public class CheckTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tax t = new Tax();
        System.out.println("enter the age and your salary");
        int age = sc.nextInt();
        float salary = sc.nextFloat();
        t.TaxCheck(age, salary);
        sc.close();
    }
}

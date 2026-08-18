import java.util.*;
class SumFactors{
    public void NumFactorsSum(int num){
        int sum = 0;
        for(int i = 1; i <= num ; i++){
            if(num % i == 0){
                sum +=i;
            }
        }
        System.out.println("the factors Sum of the number is "+sum);
    }
}
public class SumOfAllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumFactors f = new SumFactors();
        System.out.println("enter the number to get all the factors Sum of the number ");
        int num = sc.nextInt();
        f.NumFactorsSum(num);
        sc.close();
    }
}

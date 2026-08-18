import java.util.*;
class Factors{
    public void NumFactors(int num){
        for(int i = 1; i <= num ; i++){
            if(num % i == 0){
                System.out.println("the factors of the number is "+i);
            }
        }
    }
}
public class FactorsOfGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factors f = new Factors();
        System.out.println("enter the number to get all the factors of the number ");
        int num = sc.nextInt();
        f.NumFactors(num);
        sc.close();
    }
}

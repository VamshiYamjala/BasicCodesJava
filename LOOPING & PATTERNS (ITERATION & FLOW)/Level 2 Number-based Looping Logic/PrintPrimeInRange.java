import java.util.*;
class Prime{
    public void primeNum(int start,int end){
        for(int i = start ; i <= end;i++){
            int count = 0;
            for(int j = 1 ; j <=i;j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("the prime number is "+i);
            }
        }
    }
}
public class PrintPrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime p = new Prime();
        System.out.println("enter the start and end range to check Prime in that number range ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        p.primeNum(start,end);
        sc.close();
    }
}

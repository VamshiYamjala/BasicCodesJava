import java.util.*;
class NumSumPrint{
    public void SumOfNum(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1;i<=5;i++){
            int num = sc.nextInt();
            if(num == 0){
                continue;
            }
            sum += num;
        }
        System.out.println("the sum is "+sum);
        sc.close();
    }
}
public class UserInput5NumAdd {
    public static void main(String[] args) {
        NumSumPrint ns = new NumSumPrint();
        ns.SumOfNum();
    }
}

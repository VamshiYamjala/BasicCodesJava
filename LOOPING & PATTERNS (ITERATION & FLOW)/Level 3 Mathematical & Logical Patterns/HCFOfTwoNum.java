import java.util.*;
class Hcf{
    public void FindHcfOf2Num(int num1 ,int num2){
        int hcfs = 1;
        for(int i = 1 ; i <= num1 ; i++){
            int LargestNum = 0;
            if(num1 % i == 0){
                LargestNum = i;
                for(int j = 1 ; j <= num2 ; j++){
                    int largNum = 0;
                    if(num2 % j == 0){
                        largNum = j;
                    }
                    if(LargestNum == largNum){
                        hcfs = largNum;
                    }
                }
            }
        }
        System.out.println(hcfs);
    }
}
public class HCFOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hcf h = new Hcf();
        System.out.println("enter the 2 num to find hcf of them");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        h.FindHcfOf2Num(num1, num2);
        sc.close();
    }
}

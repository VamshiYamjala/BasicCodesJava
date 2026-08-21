import java.util.*;

class BinaryAndEven {
    public void BinaryAndEvenCounPrint(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int temp = i;
            int val,rem;
            String num = "";
            while (temp > 0) {
                val = temp % 2;
                if(val == 1){
                    count++;
                }
                rem = temp / 2;
                num = val + num;
                temp = rem;
            }
            if(count % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class BinaryRepresentationAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range n");
        int n= sc.nextInt();
        BinaryAndEven bn = new BinaryAndEven();
        bn.BinaryAndEvenCounPrint(n);
        sc.close();
    }
}
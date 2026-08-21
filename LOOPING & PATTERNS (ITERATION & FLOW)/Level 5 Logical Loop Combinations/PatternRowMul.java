import java.util.*;
class Pattern{
    public void PatternRows(int r){
        for(int i = 1;i<=r;i++){
            int val = i*i;
            System.out.println(val);
        }
    }
}
public class PatternRowMul{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = new Pattern();
        System.out.println("enter the number n of ranh=ge of rows");
        int r = sc.nextInt();
        p.PatternRows(r);
        sc.close();
    }
}
import java.util.Arrays;

class Zeros{
    public void MoveZeros(int[] num){
        int[] num1 = new int[num.length];
        int j = 0;
        for(int i = 0;i<num.length;i++){
            if(num[i] != 0){
                num1[j] = num[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(num1));
    }
}
public class MoveZerosToEnd {
    public static void main(String[] args) {
        Zeros z = new Zeros();
        int[] num = {5, 0, 2, 0, 8, 0, 4};
        z.MoveZeros(num);
    }
}

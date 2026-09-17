import java.util.Arrays;

class Rotate{
    public void RotateAnArray(int[] num){
        int[] num1 = new int[num.length];
        int n = num[num.length-1];
        num1[0] = n;
        int j = 1;
        for(int i = 0;i<num.length-1;i++){
            num1[j] = num[i];
            j++;
        }
        System.out.println(Arrays.toString(num1));
    }
}
public class RotateAnArrayByOnePosition {
    public static void main(String[] args) {
       Rotate r = new Rotate();
       int[] num = {10, 20, 30, 40, 50};
       r.RotateAnArray(num); 
    }
}

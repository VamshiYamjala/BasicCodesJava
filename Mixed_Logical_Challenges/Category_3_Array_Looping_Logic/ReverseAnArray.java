import java.util.Arrays;

class Reverse{
    public void PrintReverse(int[] num){
        int first = 0;
        int last = num.length-1;
        while(first < last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(num));
    }
}
public class ReverseAnArray {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        int[] num = {10, 20, 30, 40};
        r.PrintReverse(num);
    }
}

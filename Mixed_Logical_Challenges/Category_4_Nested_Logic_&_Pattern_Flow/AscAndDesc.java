import java.util.Arrays;

class AD{
    public void PrintAscAndDesc(int[] num){
        Arrays.sort(num);
        int[] num1 = new int[num.length];
        int right = num.length-1;
        System.out.println("Ascending order :"+Arrays.toString(num));
        int i = 0;
        while(right>=0){
            num1[i] = num[right];
            right--;
            i++;
        }
        System.out.println("Descending Order : "+Arrays.toString(num1));
    }
}
public class AscAndDesc {
    public static void main(String[] args) {
        AD ad = new AD();
        int[] num = {5, 2, 8, 1, 3};
        ad.PrintAscAndDesc(num);
    }
}

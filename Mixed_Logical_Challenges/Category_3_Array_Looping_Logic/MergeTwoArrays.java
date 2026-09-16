import java.util.Arrays;

class Merge{
    public void PrintMergeArray(int[] num1,int[] num2){
        int[] mnum = new int[num1.length+num2.length];
        System.arraycopy(num1, 0, mnum, 0, num1.length);
        System.arraycopy(num2, 0, mnum, num1.length, num2.length);
        System.out.println(Arrays.toString(mnum));
    }
}
public class MergeTwoArrays {
    public static void main(String[] args) {
        Merge m = new Merge();
        int[] num1 = {10, 20, 30};
        int[] num2 = {40, 50, 60, 70};
        m.PrintMergeArray(num1, num2);
    }
}

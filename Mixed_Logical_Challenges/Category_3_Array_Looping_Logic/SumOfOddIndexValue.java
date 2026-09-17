class OddSum{
    public void PrintSumOfOdd(int[] num){
        int sum = 0;
        for(int i = 0;i<num.length;i++){
            if(i % 2 != 0){
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}
public class SumOfOddIndexValue {
    public static void main(String[] args) {
        OddSum os = new OddSum();
        int[] num = {10, 20, 30, 40, 50, 60};
        os.PrintSumOfOdd(num);
    }
}

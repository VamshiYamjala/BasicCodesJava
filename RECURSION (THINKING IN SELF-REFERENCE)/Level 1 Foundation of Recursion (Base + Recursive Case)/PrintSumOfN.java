public class PrintSumOfN {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        PrintSumOfN ps = new PrintSumOfN();
        System.out.println(ps.SumOfN(1,num,sum));
    }
    public int SumOfN(int n,int num,int sum){
        if(n == num){
            sum +=n;
            return sum;
        }
        sum += n;
        return SumOfN(n + 1, num,sum);
    }
}

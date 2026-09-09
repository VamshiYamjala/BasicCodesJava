public class OddSum {
    public static void main(String[] args) {
        int n = 5;
        int num = n * 2;
        int sum = 0;
        OddSum o = new OddSum();
        System.out.println(o.Odd(num, sum));
    }
    public int Odd(int num,int sum){
        if(num == 0){
            return sum;
        }
        if(num % 2 != 0){
            sum += num;
        }
        return Odd(num -1, sum);
    }
}

public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sd = new SumOfDigits();
        int sum = 0;
        int num = 12345;
        System.out.println(sd.SumOf(num, sum));
    }
    public int SumOf(int num,int sum){
        if(num == 0){
            return sum;
        }
        sum += num % 10;
        num = num / 10;
        return SumOf(num, sum);
    }
}

class Sum{
    public void PrintSum(int number){
        int sum1 = 0;
        int remainder = 0;
        while(number > 0){
            remainder = number % 10;
            sum1 += remainder;
            number = number / 10;; 
        }
        System.out.println(sum1);
    }
}
public class SumOfDigits {
    public static void main(String[] args) {
        Sum s = new Sum();
        int number = 12345;
        s.PrintSum(number);
    }
}

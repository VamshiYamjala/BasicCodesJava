class SumOfDigit{
    public void DigitSumMUlOf3(){
        for(int i = 1; i <= 100 ; i++){
            int temp = i;
            int sum = 0;
            int value;
            while(temp > 0){
                value = temp % 10;
                sum += value;
                temp /= 10;
            }
            if(sum % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
public class DigitsAddSumMulOf3 {
    public static void main(String[] args) {
        SumOfDigit sd = new SumOfDigit();
        sd.DigitSumMUlOf3();
    }
}

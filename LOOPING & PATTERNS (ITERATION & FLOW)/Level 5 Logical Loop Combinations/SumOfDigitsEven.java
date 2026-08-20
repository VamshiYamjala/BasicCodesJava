class PrintNum{
    public void DigitsSumEvens(){
        for(int i = 1; i<=100 ; i++){
            int temp = i;
            int remainder;
            int sum = 0;
            
            while(temp>0){
                remainder = temp % 10;
                sum +=remainder;
                temp /= 10;
            }
            if(sum % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
public class SumOfDigitsEven {
    public static void main(String[] args) {
        PrintNum pn = new PrintNum();
        pn.DigitsSumEvens();
    }
}

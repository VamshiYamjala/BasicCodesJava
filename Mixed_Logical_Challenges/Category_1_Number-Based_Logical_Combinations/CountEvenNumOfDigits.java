class Even{
    public void CountEven(int num){
        int rem = 0;
        int count = 0;
        while(num > 0){
            rem = num % 10;
            if(rem % 2 == 0){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
public class CountEvenNumOfDigits {
    public static void main(String[] args) {
        Even e = new Even();
        int num = 123456789;
        e.CountEven(num);
    }
}

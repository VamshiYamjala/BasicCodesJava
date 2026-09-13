class Armstrong{
    public void PrintArmstrongInrange(){
        for(int i = 1;i<1000;i++){
            if(i < 10){
                System.out.println(i);
            }
            else if(i >= 10 && i < 100){
                int num = i;
                int rem = 0;
                int sum = 0;
                while(num > 0){
                    rem = num % 10;
                    sum += rem * rem;
                    num /= 10;
                }
                if(i == sum){
                    System.out.println(i);
                }
            }
            else if(i >= 100 && i < 1000){
                int num1 = i;
                int rem1 = 0;
                int sum1 = 0;
                while(num1 > 0){
                    rem1 = num1 % 10;
                    sum1 += rem1*rem1*rem1;
                    num1 /= 10;
                }
                if(i == sum1){
                    System.out.println(i);
                }
            }
        }
    }
}
public class PrintAllArmstrongNum {
    public static void main(String[] args) {
        Armstrong as = new Armstrong();
        as.PrintArmstrongInrange();
    }
}

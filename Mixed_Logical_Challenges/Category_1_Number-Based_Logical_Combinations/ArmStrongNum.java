class Arm{
    public void PrintArmStrong(int num){
        int number = num;
        int remainder = 0;
        int sum = 0;
        while(num > 0){
            remainder = num % 10;
            sum += remainder * remainder * remainder;
            num /= 10;
        }
        if(number == sum){
            System.out.println("Number is a armstrong number ");
        }
        else{
            System.out.println("Number is not a armstrong number ");
        }
    }
}
public class ArmStrongNum {
    public static void main(String[] args) {
        Arm a = new Arm();
        int num = 153;
        a.PrintArmStrong(num);
    }
}

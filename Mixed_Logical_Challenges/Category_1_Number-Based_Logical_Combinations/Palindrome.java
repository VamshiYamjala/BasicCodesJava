class palin{
    public void PrintPalindromeOrNot(int num){
        int number = num;
        int n = 0;
        int remainder = 0;
        while(num > 0){
            remainder = num % 10;
            n = n * 10 + remainder;
            num /= 10;
        }
        if(number == n){
            System.out.println(number+" is palindrome");
        }
        else{
            System.out.println(number+" is Not palindrome");
        }
    }
}
public class Palindrome{
    public static void main(String[] args) {
        palin p = new palin();
        int num = 121;
        p.PrintPalindromeOrNot(num);
    }
}
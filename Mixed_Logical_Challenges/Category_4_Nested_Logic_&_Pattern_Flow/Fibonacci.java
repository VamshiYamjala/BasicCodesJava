public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int n = 0;
        int end = 7;
        Fibo(num1, num2, n,end);
    }
    static void Fibo(int num1,int num2,int n,int end){
        if(n == end){
            return ;
        }
        System.out.println(num1);
        int num3 = num1+num2;
        num1 = num2;
        num2 = num3;
        Fibo(num1, num2, n+1, end);
    }
}

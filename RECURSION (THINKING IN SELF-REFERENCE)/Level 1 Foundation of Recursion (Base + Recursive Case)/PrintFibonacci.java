public class PrintFibonacci {
    public static void main(String[] args) {
        PrintFibonacci pf = new PrintFibonacci();
        int first = 0;
        int second = 1;
        int num = 0;
        int n = 7;
        System.out.println(pf.Fibonacci(n,num, first, second));
    }
    public int Fibonacci(int n,int num,int first,int second){
        if(n == 0){
            return first;
        }
        if(n == 1){
            return second;
        }
        num = first + second;
        first = second;
        second = num;
        return Fibonacci(n-1, num, first, second);

    }
}

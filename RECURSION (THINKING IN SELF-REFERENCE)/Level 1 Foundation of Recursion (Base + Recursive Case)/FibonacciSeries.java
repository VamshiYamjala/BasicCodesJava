public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int temp = 0;
        int second = 1;
        int num = 7;
        System.out.println(first);
        System.out.println(second);
        fibo(2,first,second,temp, num);
    }   
    static void fibo(int n,int first,int second,int temp,int num){
        if(n == num){
            System.out.println(first + second);
            return;
        }
        temp = first + second;
        System.out.println(temp);
        first = second;
        second = temp; 
        fibo(n + 1, first, second,temp,num);
    } 
}

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        Factorial(num,fact);
    }
    static void Factorial(int num,int fact){
        if(num == 0){
            System.out.println(fact);
            return ;
        }
        fact *= num;
        Factorial(num-1, fact);
    }
}

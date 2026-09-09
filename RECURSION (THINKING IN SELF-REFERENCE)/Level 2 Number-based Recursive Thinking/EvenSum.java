public class EvenSum {
    public static void main(String[] args) {
        EvenSum e = new EvenSum();
        int n = 5;
        int even = n * 2;
        int sum = 0;
        System.out.println(e.Even(even, sum));
    }
    public int Even(int even,int sum){
        if(even == 0){
            return sum;
        }
        if(even % 2 == 0){
            sum+=even;
        }
        return Even(even - 1, sum);
    }
}

public class PrintOddNum {
    public static void main(String[] args) {
        int num = 10;
        OddNum(1, num);
    }
    static void OddNum(int n,int num){
        if(n == num){
            if(n % 2 != 0){
                System.out.println(n);
            }
            return ;
        }
        if(n % 2 != 0){
            System.out.println(n);
        }
        OddNum(n + 1, num);
    }
}

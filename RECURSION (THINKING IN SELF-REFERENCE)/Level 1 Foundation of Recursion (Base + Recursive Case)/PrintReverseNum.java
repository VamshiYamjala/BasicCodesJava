public class PrintReverseNum {
    public static void main(String[] args) {
        ReverseNum(5);
    }
    static void ReverseNum(int n){
        if(n == 1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        ReverseNum(n - 1);
    }
}

public class PrintEvenNum {
    public static void main(String[] args) {
        int num = 10;
        EvenNum(1, num);
    }

    static void EvenNum(int n, int num) {
        if (n == num) {
            if(n % 2 == 0){
                System.out.println(n);
            }
            return;
        }
        if (n % 2 == 0) {
            System.out.println(n);
        }
        EvenNum(n + 1, num);
    }
}

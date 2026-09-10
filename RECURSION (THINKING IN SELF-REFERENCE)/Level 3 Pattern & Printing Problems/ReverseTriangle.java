public class ReverseTriangle {
    public static void main(String[] args) {
        int n = 5;
        RTriangle(n);
    }
    static void RTriangle(int n){
        if(n == 0){
            return ;
        }
        System.out.print("*".repeat(n));
        System.out.println();
        RTriangle(n - 1);
    }
}

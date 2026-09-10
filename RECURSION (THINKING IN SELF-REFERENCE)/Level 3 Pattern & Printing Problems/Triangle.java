public class Triangle {
    public static void main(String[] args) {
        int n = 5;
        T(n);
    }
    static void T(int n){
        if(n == 0){
            return ;
        }
        System.out.print("*".repeat(n));
        System.out.println();
        T(n-1);
    }
}

public class Square {
    public static void main(String[] args) {
        int n = 4;
        S(n);
    }
    static void S(int n){
        if(n==0){
            return ;
        }
        System.out.print("****");
        System.out.println();
        S(n - 1);
    }
}

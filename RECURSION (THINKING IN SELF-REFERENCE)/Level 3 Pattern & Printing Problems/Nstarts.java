public class Nstarts{
    public static void main(String[] args) {
        int n = 5;
        starts(n);
    }
    static void starts(int n){
        if(n == 0){
            return ;
        }
        System.out.print("*");
        starts(n - 1);
    }
}
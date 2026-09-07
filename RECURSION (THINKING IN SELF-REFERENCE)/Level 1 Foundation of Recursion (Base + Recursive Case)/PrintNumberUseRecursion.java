public class PrintNumberUseRecursion{
    public static void main(String[] args) {
        int n = 5;
        PrintNum(1,n);
    }
    static void PrintNum(int v,int n){
        if(v > n){
            return;
        }
        System.out.println(v);
        PrintNum(v+1,n);
    }
}
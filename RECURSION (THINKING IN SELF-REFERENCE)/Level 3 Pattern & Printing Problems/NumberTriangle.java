public class NumberTriangle {
    public static void main(String[] args) {
        int n = 1;
        NTriangle(n);
    }
    static void NTriangle(int n){
        if(n == 6){
            return ;
        }
        printNum(1, n);
        System.out.println();
        NTriangle(n + 1);
    }
    static void printNum(int i,int n){
        if(i > n){
            return ;
        }
        System.out.print(i);
        printNum(i+1, n);
    }
}
